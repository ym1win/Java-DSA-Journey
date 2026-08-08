package patterns;

import java.util.Scanner;

public class star_cross {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows=sc.nextInt();


        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){

                if(i==j || (i+j)==6)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
}
