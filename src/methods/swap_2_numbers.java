package methods;

import java.util.Scanner;

public class swap_2_numbers {

    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;

    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Before swap");
        System.out.println("x : "+x);
        System.out.println("y : "+y);

        System.out.println("After swap");
        swap(x,y);                       // swap kbhi hoga h nhi
        System.out.println("x : "+x);
        System.out.println("y : "+y);

    }
}
