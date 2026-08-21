package arrays;

public class duplicate_no_xor {

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 3};

        boolean[] seen = new boolean[51];
        int result = 0;

        for (int n : nums) {
            if (seen[n]) {
                result ^= n;
            } else {
                seen[n] = true;
            }
        }

        System.out.println("XOR of duplicate numbers: " + result);
    }
}