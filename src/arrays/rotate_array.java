package arrays;

import java.util.Scanner;

public class rotate_array {
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k");
        int k = sc.nextInt();

        k = k % n;   //remove unnecessary rotations

        // k % n isliye karte hain kyunki n rotations ke baad array original position par aa jata hai.
        // Isliye sirf k % n rotations actually matter karti hain.
        // Example: n = 5, k = 7
        // 7 % 5 = 2 → 7 rotations ka effect same hai as 2 rotations.

        // Step 1: reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: reverse remaining elements
        reverse(arr, k, n - 1);

        // Step 3: reverse complete array
        reverse(arr, 0, n - 1);

        System.out.println("Array after counterclockwise rotation:");

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

