package patterns;

import java.util.Scanner;

public class number_square {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of rows");
        int rows=sc.nextInt();
        System.out.println("Enter no of columns");
        int columns=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
