package If_else;
import java.util.Scanner;
public class even_odd {

    static void main() {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive number: ");

        int n=sc.nextInt();
        if(n%2==0)
            System.out.println(n+ " is an even number ");
        else
            System.out.println(n+ " is an odd number");
    }
}
