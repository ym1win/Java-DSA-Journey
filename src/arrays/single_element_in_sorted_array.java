package arrays;

public class single_element_in_sorted_array {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 4, 4};

        int result = singleNonDuplicate(nums);

        System.out.println("Single element: " + result);
    }

    public static int singleNonDuplicate(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}