package arrays;

import java.util.Scanner;

public class segregate_0_and_1_without_sort {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before segregation:");
        for(int element:arr){
            System.out.print(element+" ");
        }

        System.out.println();

        int numzero=0;
        int numone=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==0)
                numzero++;
            else
                numone++;
        }

        for(int i=0;i<numzero;i++){
            arr[i]=0;
        }
        for(int i=numzero;i<arr.length;i++){
            arr[i]=1;
        }

        System.out.println("Array after segregation:");
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
