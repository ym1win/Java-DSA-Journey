package basics;
import java.util.Scanner;
public class area_of_rectangle {
    static void main() {
        Scanner sc=new Scanner(System.in); // input lene ke liye

        System.out.println("Enter length and breadth");
        int l=sc.nextInt();
        int b= sc.nextInt();

        int area=l*b;
        System.out.println("Area of rectangle is : "+area);
    }
}
