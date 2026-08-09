package patterns;

import java.util.Scanner;

public class pyramid_method_nsp_nst {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=sc.nextInt();
        int nsp=n-1; // nsp control krta hai no of spaces to be printed on each row and initialization done through ki initially no of spaces kitne thee i.e in 1st row(for n=1)
        int nst=1;   // nst control krta hai no of stars to be printed on each row and initialization done through ki initially no of stars kitne thee i.e in 1st row(for n=1)
        for(int i=1;i<=n;i++){

            for(int k=1;k<=nsp;k++){   // this loop controls no of spaces to be printed , so k<=nsp
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){  // this loop controls no of stars to be printed , so j<=nst
                System.out.print("* ");
            }
            System.out.println();
            nsp--;  // per row spaces kaise increase ya decrease ho rhe
            nst+=2; // per row stars kaise increase ya decrease ho rhe
        }
    }
}
