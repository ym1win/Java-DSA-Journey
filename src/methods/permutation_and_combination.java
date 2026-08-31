package methods;

// Ques- Take 'n' and 'r' as input and print nCr and nPr

// nCr=n!/r!*(n-r)!

//nPr=n!/(n-r)!


import java.util.Scanner;

public class permutation_and_combination {

    public static int factorial(int x){
        int f=1;
        for(int i=1;i<=f;i++){
            f*=i;
        }
        return f;
    }


    static void main() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n and r");
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nCr=0;

//        int nfact=1;
//        for(int i=1;i<=n;i++){
//
//            nfact*=i;
//        }
//
//        int rfact=1;
//        for(int i=1;i<=n;i++){
//
//            rfact*=i;
//        }
//
//        int n_minus_rfact=1;
//        for(int i=1;i<=n-r;i++){
//
//            n_minus_rfact*=i;
//        }
//
//        int nCr=nfact/(rfact*n_minus_rfact);

        nCr=factorial(n)/factorial(r)*factorial((n-r));

        // beautiful use of making a separate factorial function
        System.out.println(nCr);
    }
}
