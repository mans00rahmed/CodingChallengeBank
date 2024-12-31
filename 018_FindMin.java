public class FindMin {
    public static int findMin(Integer[] nums) {
        int min = 0;
        int max = nums.length - 1;
        while (min < max) {
            int mid = min + (max - min) / 2;
            if (nums[mid] < nums[max]) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return nums[min];
    }

    public static void main(String[] args) {
        Integer[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = findMin(nums);
        System.out.println("Min value: " + result);
    }
}
