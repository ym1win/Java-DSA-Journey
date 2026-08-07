package If_else;
import java.util.Scanner;
public class student_code {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=sc.nextInt();

        if(n%5==0 && n%3==0)                                  // priority ke hisaab se case ka sequence rkha jaata hai
            System.out.println("divisible by both 5 and 3");  // cuz if-else ladder mein jo case true ho gya uske baad
        else if(n%5==0)                                       // ka code execute ni hota
            System.out.println("divisible by 5");             // isliye divisibility by both 5&3 waala case sbse pehle chech kia
        else if(n%3==0)
            System.out.println("divisible by 3");
            else
            System.out.println("neither divisible by 5 nor 3");
    }
}
