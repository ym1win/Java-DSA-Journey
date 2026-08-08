/*
Problem : Composite number(Aisa number jiska 1 aur woh number khud chhodke v ek aur factor mil jaaye)

Platform : Practice

Difficulty : Easy

Topic : Loops

Approach :

Time Complexity :

Space Complexity :
*/

package loops;

import java.util.Scanner;

class composite_number {

    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        boolean flag=true;

        for(int i=2;i<(n/2);i++){  // kisi v number ke jitne factors n/2 ke pehle hote hai
            // exactly utne h factors n/2 ke baad v hote hai
            // isliye better optimization ke liye n/2 tk h loop rkha
            if(n%i==0){
                flag = false;
                break;
            }

        }
        if(n==1)
            System.out.println("Neither prime nor composite");
        else if(flag==true)
            System.out.println("Prime number");
        else
            System.out.println("Composite number");

    }
}
