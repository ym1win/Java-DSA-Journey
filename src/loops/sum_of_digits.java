/*
Problem : Sum of digits of a number

Platform : Practice

Difficulty : Easy

Topic : Loops

Approach :

Time Complexity :

Space Complexity :
*/


package loops;
import java.util.Scanner;
public class sum_of_digits {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
        int digit=0;

        while(n!=0){
            digit=n%10;
            sum+=digit;
            n=n/10;
        }

        System.out.println("Sum of digits is : "+ sum);

    }
}
