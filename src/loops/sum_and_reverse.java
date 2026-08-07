package loops;
import java.util.Scanner;
public class sum_and_reverse {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number :");
        int n=sc.nextInt();

        int sum=0,rev=0,a=0;

        while(n!=0){
            a=n%10;
            sum+=a;

            rev*=10;
            rev+=a;
            n/=10;

        }
        System.out.println((sum>0)?"Sum of digits of number is:"+sum :"Sum of digits of number is:"+ -sum );
        System.out.println("Reverse number is:"+rev);
    }
}
