package arrays;

import java.util.HashSet;
import java.util.Set;

public class distribute_candies {

    public static void main(String[] args) {

        int[] candyType = {1, 1, 2, 2, 3, 3};

        int result = distributeCandies(candyType);

        System.out.println("Maximum different candy types: " + result);
    }
    public static int distributeCandies(int[] candyType) {

        Set<Integer> types = new HashSet<>();

        // Store only unique candy types
        for (int candy : candyType) {
            types.add(candy);
        }

        // Alice can eat only half of the candies
        return Math.min(types.size(), candyType.length / 2);
    }
}