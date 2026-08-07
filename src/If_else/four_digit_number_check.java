package If_else;
import java.util.Scanner;
public class four_digit_number_check {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=sc.nextInt();

        if(n>999&&n<10000)
            System.out.println(n+" is a four digit number");
        else
            System.out.println(n+" is not a four digit number");
    }
}
