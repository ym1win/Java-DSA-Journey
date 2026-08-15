package arrays;

import java.util.Scanner;

public class second_maximum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {  // to skip duplicates
                smax = arr[i];
            }
        }

        if (smax == Integer.MIN_VALUE) {
            System.out.println("Second distinct maximum does not exist");
        } else {
            System.out.println("Second maximum element is: " + smax);
        }
    }
}