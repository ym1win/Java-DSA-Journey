package patterns;

import java.util.Scanner;



//🔥 Actually AP se derive karne ka aur clean way
//
//Tumne bola:
//
//decreasing AP tha no. of spaces
//
//Bilkul.
//
//Pattern problems mein ye approach rakho:
//
//Step 1 — Values likho
//6  4  2  0
//Step 2 — Difference
//-2
//Step 3 — First term ko n ke terms mein express karo
//
//First term:
//
//        6
//
//For n = 4:
//
//        6 = 2(n - 1)
//Step 4 — AP formula
//spaces = a + (i - 1)d
//
//So:
//
//spaces = 2(n - 1) + (i - 1)(-2)
//
//Expand:
//
//        = 2n - 2 - 2i + 2
//
//Therefore:
//
//        = 2n - 2i
//
//Take 2 common:
//
//        = 2(n - i)
//
//        🔥 Derived.
//
//🧠 Pattern questions ke liye ye habit bana lo
//
//Jab bhi spaces/numbers ka formula samajh na aaye:
//
//Don't guess.
//
//Ye 4 questions pucho:
//
//        1. First row mein kitne hain?
//        2. Next row mein kitne hain?
//        3. Difference kitna hai?
//        4. Last row mein kitne hone chahiye?
//
//Then AP/formula derive karo.

public class triangle_space_vertically_inverted_triangle {

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Left side: 1 2 3 ... i
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            // Middle spaces
            for (int k = 1; k <= 2 * (n - i); k++) { //AP se formula derive kia
                System.out.print("  ");
            }

            // Right side: i ... 3 2 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }

            System.out.println();
        }

    }
}
