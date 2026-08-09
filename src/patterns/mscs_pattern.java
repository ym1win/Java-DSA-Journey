package patterns;

public class mscs_pattern {
    static void main() {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // 1. Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 2. First star
            System.out.print("*");

            // 3. Inner spaces + second star
            if (i > 1) {

                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            // 4. Next row
            System.out.println();
        }
    }
}
