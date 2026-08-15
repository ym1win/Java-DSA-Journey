package arrays;

import java.util.Scanner;

public class prin_negative_element {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int element:arr){
            if(element<0)
                System.out.print(element+" ");
        }

    }
}
