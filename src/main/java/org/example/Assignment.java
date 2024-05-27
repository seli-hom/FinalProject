package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.Random;

@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Assignment {
    private String assignementId;
    private String assignementName;
    private double weight;
    private int maxScore;
    private double assignmentAverage;
    private ArrayList<Integer> scores;
    private static int nextId = 1;

    public Assignment(String assignementName, double weight, int maxScore, int studentAmount) {
        this.assignementId = String.valueOf('A' + nextId);
        this.assignementName = assignementName;
        this.weight = weight;
        this.maxScore = maxScore;
        this.scores = new ArrayList<>(studentAmount);
        nextId++;
    }

    public Assignment(String assignementName, double weight, ArrayList<Integer> scores) {
        this.assignementName = assignementName;
        this.weight = weight;
        this.scores = scores;
    }

    /**
     * Calculates the average score for one assignment
     */
    public void calcAssignmentAvg(){
        double sum = 0;
        int students = 0;

        for (int num : scores) {
            sum += num;
            students++;
        }

        assignmentAverage = sum / students * weight;
    }

    /**
     * Generates random scores for all students in an assignment
     */
    private void generateRandomScore(){
        Random rand = new Random();
        int randNum = rand.nextInt(0,11);

        int randomScore = switch (randNum) {
            case 0 -> rand.nextInt(0,60);
            case 1,2 -> rand.nextInt(60,70);
            case 3,4 -> rand.nextInt(70,80);
            case 5,6,7,8 -> rand.nextInt(80,90);
            case 9,10 -> rand.nextInt(90,101);
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "assignementId='" + assignementId + '\'' +
                ", assignementName='" + assignementName + '\'' +
                ", weight=" + weight +
                ", maxScore=" + maxScore +
                '}';
    }
}
