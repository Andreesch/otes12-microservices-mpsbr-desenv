package com.criasoft.processcapacity.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.criasoft.processcapacity.api.dto.CapacityResponseDto;
import com.criasoft.processcapacity.client.ProcessIndicatorRestClient;
import com.criasoft.processcapacity.domain.Capacity;
import com.criasoft.processcapacity.domain.CapacityEnunciate;
import com.criasoft.processcapacity.domain.ScoreGrade;
import com.criasoft.processcapacity.helper.AchievedGradeHelper;
import com.criasoft.processcapacity.repository.CapacityRepository;
import com.criasoft.processcapacity.services.vo.CapacityVO;
import com.criasoft.processcapacity.services.vo.ProcessAvaliationSearchResponseVO;

@Service
public class CapacityService {

    @Autowired
    private CapacityRepository capacityRepository;

    @Autowired
    private ProcessIndicatorRestClient processIndicatorRestClient;

    public List<CapacityResponseDto> build(String companyId) {
        List<ProcessAvaliationSearchResponseVO> processVOs = processIndicatorRestClient.getAvaliationsByCompanyId(companyId);

        OptionalDouble scoreAverage = processVOs.stream()
                .mapToInt(processAvaliationSearchResponseVO -> Integer.parseInt(processAvaliationSearchResponseVO.getScoreGrade().scoreNumber))
                .average();

        if (scoreAverage.isPresent()) {
            int scoreAverageRounded = (int) Math.round(scoreAverage.getAsDouble());

            ScoreGrade totalScore = ScoreGrade.findByScoreNumber(String.valueOf(scoreAverageRounded));

            if (!Objects.isNull(totalScore)) {
                List<CapacityVO> capacityVOs = new ArrayList<>();

                for(CapacityEnunciate capacityEnunciate : CapacityEnunciate.values()) {
                    CapacityVO capacityVO = new CapacityVO()
                            .setCompanyId(companyId)
                            .setDescription(capacityEnunciate.enunciate)
                            .setFinalScore(totalScore)
                            .setAchievedLevelG(AchievedGradeHelper.hasAchievedGrade(totalScore));
                    capacityVOs.add(capacityVO);
                }

                List<Capacity> capacities = buildAll(capacityVOs);

                capacityRepository.saveAll(capacities);

                return capacities.stream()
                        .map(Capacity::toDto)
                        .collect(Collectors.toList());

            }
        }

        return null;

    }

    private List<Capacity> buildAll(List<CapacityVO> VOs) {
        return VOs.stream().map(capacityVO -> new Capacity()
                .setDescription(capacityVO.getDescription())
                .setFinalScore(capacityVO.getFinalScore())
                .setCompanyId(capacityVO.getCompanyId())
                .setAchievedLevelG(capacityVO.achievedLevelG()))
                .collect(Collectors.toList());
    }
}
