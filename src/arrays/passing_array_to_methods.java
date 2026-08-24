package arrays;

public class passing_array_to_methods {
    static void main() {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);   // method mein original array paas krke method ke andr value change kri
                                      // but phir v original array ka content change ho gya
                                      // cuz "x array" jo hai woh khudka nya array ni bnayega i.e dabba(container)
        // x v ab uss memory location ko point krega jha arr store hai
        // i.e x v ab ek reference hai to that particular original array

        // in simple language we know ki arr reference variable hai and woh array store ni krta , inspite arr stores memory address of that array
        // toh arr ko jb method mein paas kia toh x ko v uss original array ka memory address mil gya
        // isliye x ke through array mein kuch change kia toh woh original array mein v reflect hua
    }
    static void change(int[] x){
        x[2]=20;
    }
}
