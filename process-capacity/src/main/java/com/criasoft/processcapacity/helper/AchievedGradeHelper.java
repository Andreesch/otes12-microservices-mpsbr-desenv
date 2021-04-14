package com.criasoft.processcapacity.helper;

import com.criasoft.processcapacity.domain.ScoreGrade;

public class AchievedGradeHelper {

    public static boolean hasAchievedGrade(ScoreGrade scoreGrade) {
        if (Integer.parseInt(scoreGrade.scoreNumber) >= 3) {
            return true;
        } else {
            return false;
        }
    }
}
