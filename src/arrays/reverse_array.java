package arrays;

import java.util.Scanner;

//  by solving this question we would learn 2 variables/ 2 pointers technique
public class reverse_array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array :");
        for(int element:arr){
            System.out.print(element+" ");
        }

        System.out.println();

        int temp=0;
        int f=0;
        int l=arr.length-1;

        while(f<l){
            temp=arr[l];
            arr[l]=arr[f];
            arr[f]=temp;

            f++;
            l--;
        }

        System.out.println("Reversed array is:");
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
