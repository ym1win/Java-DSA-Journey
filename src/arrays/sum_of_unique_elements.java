package arrays;

public class sum_of_unique_elements {

    public static int sumOfUnique(int[] nums) {

        // nums[i] ki frequency store karne ke liye
        int[] freq = new int[101]; // size 101 cuz lc ques mein constraint yhi dia hai

        // Har element ko count karo
        for (int num : nums) {
            freq[num]++;
        }

        int sum = 0;

        // Sirf jo element exactly 1 baar aaya hai usko add karo
        for (int num : nums) {
            if (freq[num] == 1) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2};

        int result = sumOfUnique(nums);

        System.out.println("Sum of unique elements: " + result);
    }
}