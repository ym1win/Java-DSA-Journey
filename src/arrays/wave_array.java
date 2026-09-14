package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class wave_array {

    static void convertToWave(int[] arr) {

        // First sort the array
        Arrays.sort(arr);

        // Swap adjacent elements
        for (int i = 0; i < arr.length - 1; i += 2) {

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");

        for (int element : arr) {
            System.out.print(element + " ");
        }

        convertToWave(arr);

        System.out.println("\nWave array:");

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}