package If_else;
import java.util.Scanner;
public class profit_loss {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to profit and loss calculator");
        System.out.println("Enter cost price");
        int cp=sc.nextInt();
        System.out.println("Enter selling price");
        int sp=sc.nextInt();

        if(sp>cp){
            System.out.println("Profit: "+ (sp-cp));
        }
        else if(sp<cp){
            System.out.println("Loss: "+ (cp-sp));
        }
        else
            System.out.println("Neither profit nor loss");

    }
}
