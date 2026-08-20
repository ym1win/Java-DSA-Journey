package arrays;

import java.util.ArrayList;
import java.util.List;

public class summary_ranges {

    public static List<String> summaryRanges(int[] nums) {

        List<String> ans = new ArrayList<>();

        int i = 0;

        while (i < nums.length) {

            int start = nums[i];

            // Consecutive elements ko traverse karo
            while (i + 1 < nums.length &&
                    nums[i + 1] == nums[i] + 1) {
                i++;
            }

            int end = nums[i];

            // Single element
            if (start == end) {
                ans.add(String.valueOf(start));
            }
            // Range
            else {
                ans.add(start + "->" + end);
            }

            i++;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 4, 5, 7};

        List<String> result = summaryRanges(nums);

        System.out.println(result);
    }
}