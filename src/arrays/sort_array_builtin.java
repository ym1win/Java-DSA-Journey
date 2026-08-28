package arrays;

import java.util.Arrays;

public class sort_array_builtin {
    static void main() {
        // sort - it sorts in ascending order
        int[] arr={-4,5,67,334,56,99,12,-9};
        print(arr);
        Arrays.sort(arr);
        System.out.println();
        System.out.println("After sorting -");
        print(arr);
    }
    static void print(int[] arr){
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
