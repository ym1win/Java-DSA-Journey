package arrays;

import java.util.*;

public class relative_rank {

    public static void main(String[] args) {

        int[] score = {10, 3, 8, 9, 4};

        String[] answer = findRelativeRanks(score);

        System.out.println(Arrays.toString(answer));
    }

    public static String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] answer = new String[n];

        // Store the original indexes
        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort indexes based on scores in descending order
        Arrays.sort(indices, (a, b) -> score[b] - score[a]);

        // Assign ranks
        for (int rank = 0; rank < n; rank++) {

            int index = indices[rank];

            if (rank == 0) {
                answer[index] = "Gold Medal";
            } else if (rank == 1) {
                answer[index] = "Silver Medal";
            } else if (rank == 2) {
                answer[index] = "Bronze Medal";
            } else {
                answer[index] = String.valueOf(rank + 1);
            }
        }

        return answer;
    }
}