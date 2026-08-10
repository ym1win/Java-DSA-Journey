package methods;

import java.util.Scanner;

public class max_of_three_numbers {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=87;

        // Math.ma(a,b,c) ye ni kr skte cuz ye wrong hai

        int max=Math.max(Math.max(a,b),c); // ye hai shi tareeka

        System.out.println("Maximum number is : "+ max);

        // imp : Maximum of four numbers
        int max2=Math.max(Math.max(Math.max(a,b),c),d);

        System.out.println("Max of four numbers is : "+max2 );


    }
}
