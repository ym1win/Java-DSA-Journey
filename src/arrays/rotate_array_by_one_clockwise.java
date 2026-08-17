package arrays;

public class rotate_array_by_one_clockwise {

    public static void rotate(int[] arr) {

        // First reverse: 0 to n-2
        reverse(arr, 0, arr.length - 2);

        // Second reverse: 0 to n-1
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int f, int l) {

        int temp = 0;

        while (f < l) {

            temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;

            f++;
            l--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        rotate(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}