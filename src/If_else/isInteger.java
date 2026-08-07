package If_else;
import java.util.Scanner;
public class isInteger {
    static void main() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        double n=sc.nextDouble();

        int x=(int)n;
        if(n-x==0)
            System.out.println(n + " is an integer");
        else
            System.out.println(n+ " is not an integer");


    }
}
