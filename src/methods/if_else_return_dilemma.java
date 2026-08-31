package methods;

public class if_else_return_dilemma {

    public static int yash(int a){
        if(a<5)
            return a;
        else
            return -1;
    }                      //error aa rha cuz java mein jb v if statement ke andr kuch return hota hai
                          //then ek else statement v zaroor hona chaiye and uss else statement ke andr v return statement zaroor hona chaiye

   //

    static void main() {
        System.out.println(yash(3));


    }
}
