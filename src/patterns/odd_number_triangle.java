package patterns;

import java.util.Scanner;

public class odd_number_triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows=sc.nextInt();


        for(int i=1;i<=rows;i++){
            int a=1;

            for(int j=1;j<=i;j++){

                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();

        }

    }
}