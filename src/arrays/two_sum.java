package arrays;

import java.util.Scanner;

public class two_sum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


       int flag1=-1;
       int flag2=-1;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){ // j=i+1 cuz arr[0]+arr[0]==2 waale cases handle krne ke liye i.e same element repeat na ho

                if(arr[i]+arr[j]==2){
                    flag1=i;
                    flag2=j;
                    break;          //inner loop unnecessary extra loop na chle
                }
            }
            if(flag1!=-1)
                break;     // outer loop unnecessary na chle
        }

        if(flag1==-1){
            System.out.println("no two sum");
        }
        else
            System.out.println("Two sum present at indexes "+flag1+" and "+flag2);

        }
    }
