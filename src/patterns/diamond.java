package patterns;

import java.util.Scanner;

public class diamond {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= nsp; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }

        nsp=1;
        nst=2*n-3; // pyramid ke neeche kitne rows print hone hai uska maths hai ye

        for (int i = 1; i <= n-1; i++) { // n-1 cuz ek row km chlega pyramid ke baad neeche

            for (int k = 1; k <= nsp; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp++;                   // pyramid ke neeche no of spaces ek se bdh rhe
            nst -= 2;                // no of stars 2 se km ho rhe
        }

    }
}

