package arrays;

import java.util.Scanner;

public class sum_of_elements {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum=0;

        for(int element:arr){

            sum+=element;

        }

        System.out.println("Sum of elements of array is :");
        System.out.println(sum);
    }
}
