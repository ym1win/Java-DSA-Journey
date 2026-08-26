package arrays;

public class single_element { // using xor operator

    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 1, 2};

        int ans = 0;

        for (int n : nums) {
            ans ^= n;
        }

        System.out.println("Single element: " + ans);
    }
}