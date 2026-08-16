package arrays;

import java.util.Scanner;

public class remove_duplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Remove duplicates
        int k = removeDuplicates(arr);

        System.out.println("Number of unique elements: " + k);

        System.out.println("Array after removing duplicates:");

        // Only first k elements are unique
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}