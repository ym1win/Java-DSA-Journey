package arrays;

import java.util.Scanner;

public class move_zeroes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        moveZeroes(nums);

        System.out.println("Array after moving zeroes:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }

    static void moveZeroes(int[] nums) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
        }
    }
}