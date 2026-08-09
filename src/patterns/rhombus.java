package patterns;

import java.util.Scanner;

public class rhombus {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){

            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
