package patterns;

import java.util.Scanner;

public class star_triangle_right_angled {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
