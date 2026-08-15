package arrays;

import java.util.Scanner;

public class input_output {
    static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter elements in array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array elements are: ");

        for(int x:arr){

            System.out.print(x+" ");
        }
    }
}
