package arrays;

import java.util.Scanner;

public class missing_number {

    static int missingNum(int[] arr) {

        int n = arr.length + 1;

        // Sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Sum of elements present in array
        int actualSum = 0;

        for (int element : arr) {
            actualSum += element;
        }
        // Difference is the missing number
        return expectedSum - actualSum;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = missingNum(arr);

        System.out.println("Missing number is: " + missing);
    }
}