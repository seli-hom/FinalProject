package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
public class Assignment {
    private String assignementId;
    private String assignementName;
    private double weight;
    private int maxScore;
    private double assignmentAverage;
    private int[] scores;
    private static int nextId = 1;

    public Assignment(String assignementName, double weight, int maxScore, int studentAmount) {
        this.assignementName = assignementName;
        this.weight = weight;
        this.maxScore = maxScore;
        this.scores = new int[studentAmount];
    }

    /**
     * Calculates the average score for one assignment
     */
    private void calcAssignmentAvg(){
        double sum = 0;
        int students = 0;

        for (int num : scores) {
            sum += num;
            students++;
        }

        assignmentAverage = sum / students;
    }
}
