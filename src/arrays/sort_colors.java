package arrays;

public class sort_colors {

    public void sortColors(int[] nums) {

        int k = 0;
        int flag = 0;
        int temp = 0;

        while (flag <= 2) {

            for (int j = k; j < nums.length; j++) {

                if (nums[j] == flag) {

                    temp = nums[k];
                    nums[k] = nums[j];
                    nums[j] = temp;

                    k++;
                }
            }

            flag++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        sort_colors obj = new sort_colors();
        obj.sortColors(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}