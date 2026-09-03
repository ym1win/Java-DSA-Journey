package arrays;

import java.util.Scanner;

public class linear_search {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched:");
        int target=sc.nextInt();
        int flag=-1;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==target){
                flag=i;
                break;
            }

        }
        if(flag==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index "+flag);
    }
}
