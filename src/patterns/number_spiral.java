package patterns;

import java.util.Scanner;

public class number_spiral {     // pehle 1/4 th print krke smjhenge then
    static void main() {         // concept of fake values and mirror se solve krenge
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=sc.nextInt();


        for(int i=1;i<=2*n-1;i++){       //2n-1 poora print krne ke liye

            for(int j=1;j<=2*n-1;j++){

                int a=i,b=j;            // copy cuz 1/4th print ke baad use

                if(i>n)
                    a=2*n-i;           // horizontal mirror
                if(j>n)
                    b=2*n-j;          // vertical mirror

                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();

        }

    }
}
