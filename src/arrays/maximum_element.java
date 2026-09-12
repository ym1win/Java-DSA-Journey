package arrays;

import java.util.Scanner;

public class maximum_element {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max=arr[0];
        for(int i=1;i<arr.length;i++){

            if(arr[i]>max)
                max=arr[i];
        }

        System.out.println("Maximum element is :");
        System.out.println(max);
    }
}
