package loops;

import java.util.Scanner;

public class factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){

            fact*=i;
        }

        System.out.println("Factorial of "+n+" is : "+fact);


    }
}