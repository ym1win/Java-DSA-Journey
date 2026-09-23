package arrays;

public class reverse_integer {

    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            int d = x % 10;
            x = x / 10;

            // Positive overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
                    (rev == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;
            }

            // Negative overflow check
            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;
            }

            rev = rev * 10 + d;
        }

        return rev;
    }

    public static void main(String[] args) {

        reverse_integer obj = new reverse_integer();

        System.out.println(obj.reverse(123));
        System.out.println(obj.reverse(-123));
        System.out.println(obj.reverse(120));
        System.out.println(obj.reverse(1534236469));
    }
}