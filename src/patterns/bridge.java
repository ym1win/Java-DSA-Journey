package patterns;

import java.util.Scanner;

public class bridge { // sbse pehle upar waali line ekdm alg then pattern ko 3 parts mein break
    static void main() { // stars+spaces+stars
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n = sc.nextInt();

        for(int i=1;i<=2*n-1;i++){  // ye loop sbse upar waali star line print krne ke liye
            System.out.print("* ");
        }
        System.out.println();  // sbse upar waale star row ke baad line change ke liye

        int nsp = 1;
        for (int i = 1; i <= n - 1; i++) {

            for (int j = 1; j <= n - i; j++) { // pehle stars print krne ke liye
                System.out.print("* ");
            }
            for (int j = 1; j <= nsp; j++) { // spaces print krane ke liye
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i; j++) { // phir stars print krne ke liye
                System.out.print("* ");
            }

            System.out.println();
            nsp+=2;                // cuz no of spaces per row 2 increase ho rhe

        }
    }
}
