package arrays;

import java.util.Scanner;

// ques - multiply odd indexed elements by 2 and add 10 to even indexed elements
public class modify_array_in_place {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before modification -");
        for(int element:arr){
            System.out.print(element+" ");
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                arr[i]+=10;
            else
                arr[i]*=2;
        }
        System.out.println();
        System.out.println("Array after modification - ");
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
