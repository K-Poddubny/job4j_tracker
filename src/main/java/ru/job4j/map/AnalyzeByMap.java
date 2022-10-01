package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int count = 0;
        double sum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                count++;
                sum += subject.score();
            }
        }
        return sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int count = 0;
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                count++;
                sum += subject.score();
            }
            Label label = new Label(pupil.name(), sum / count);
            result.add(label);
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Double> tempMap = new LinkedHashMap<>();
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                double score = subject.score();
                String subjectName = subject.name();
                if (tempMap.get(subjectName) == null) {
                    tempMap.put(subjectName, score);
                } else {
                    Double prevScore = tempMap.get(subjectName);
                    tempMap.put(subjectName, prevScore + score);
                }
            }
        }
        for (String key : tempMap.keySet()) {
            double value = tempMap.get(key);
            result.add(new Label(key, value / pupils.size()));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            Label label = new Label(pupil.name(), sum);
            result.add(label);
        }
        Collections.sort(result);
        return result.get(result.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Double> tempMap = new LinkedHashMap<>();
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                double score = subject.score();
                String subjectName = subject.name();
                if (tempMap.get(subjectName) == null) {
                    tempMap.put(subjectName, score);
                } else {
                    Double prevScore = tempMap.get(subjectName);
                    tempMap.put(subjectName, prevScore + score);
                }
            }
        }
        for (String key : tempMap.keySet()) {
            double value = tempMap.get(key);
            result.add(new Label(key, value));
        }
        Collections.sort(result);
        return result.get(result.size() - 1);
    }
}