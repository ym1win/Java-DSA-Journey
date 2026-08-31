package methods;

public class pass_by_value_and_pass_by_reference {

    public static void change(int x){

        x=10;
    }


    static void main() {

        int x=6;
        System.out.println(x);
        change(x);  // pass by value , x ki value i.e 6 function mein paas hui
                    // then uss function ke parameter ka alg box hai wha jaake store ho gyi
                    // then jo v change hoga uss function waale box mein hoga
                    // main waala variable box ka value as it is rhega
                    // isliye yha x ki value 6 h rhegi
                    // video mein sir ne acche se smjhaya hai
        System.out.println(x);


    }
}
