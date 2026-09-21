package arrays;

import java.util.Scanner;

public class max_consecutive_ones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findMaxConsecutiveOnes(nums);

        System.out.println("Maximum consecutive ones: " + result);

        sc.close();
    }

    static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;

                if (count > max) {
                    max = count;
                }
            }
            else {
                count = 0;
            }
        }

        return max;
    }
}