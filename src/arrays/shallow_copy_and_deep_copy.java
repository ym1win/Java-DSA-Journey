package arrays;
import java.util.Arrays;

public class shallow_copy_and_deep_copy {
    static void main() {
        int[] arr={1,2,3,4,5,};
        int[] x=arr; // x is shallow copy of arr
        x[1]=100;
        System.out.println("Shallow copy - ");
        System.out.println(arr[1]);
        System.out.println(x[1]);

        System.out.println();

        // deep copy
        int[] y=Arrays.copyOf(arr,arr.length); // kitne length tk copy krna hai uske liye length paramter hota hai
        y[2]=200;
        System.out.println("Deep copy - ");
        System.out.println(arr[2]);
        System.out.println(y[2]); // yha original array mein change ni hua kyu ki hmne ek nya array h copy krke bna dia and uska memory address y mein store kra dia
                                  // mtlb nya dabba h bna dia

    }
}
