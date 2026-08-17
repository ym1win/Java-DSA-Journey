package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class leaders_in_array {

    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> leader = new ArrayList<>();

        int maxright = arr[arr.length - 1];
        leader.add(maxright);

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] >= maxright) {

                leader.add(arr[i]);
                maxright = arr[i];
            }
        }

        Collections.reverse(leader);

        return leader;
    }

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> result = leaders(arr);

        System.out.println(result);
    }
}