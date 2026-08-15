package methods;

public class return_type {

    // function ka jo return data type hai , toh uss function ke code block mein
    // woh data type return krna compulsary hai

    public static int example(){
        System.out.println("hello");
        System.out.println("world");

        return 5;  // return mtlb function yha khtm and function ye return value hold krta hai
    }              // return type int hai , isliye 5 return krna compulsary hai


    static void main() {
        int x=example();
       // System.out.println(example());
        System.out.println(x);

       // example(); stand slone call lgai bs
        //           yha example() function khud ka kaam krega i.e apne andr ke code blocks
                   // jaise ki yha pe hello world print krega
                 //  but jo function ki value hai i.e 5(return) woh khi use ni hoga
                // cuz woh valye kisi variable mein store ni ki gyi and na h khi use
    }
}
