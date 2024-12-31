import java.util.*;

public class SubArray {
    public static List<List<Integer>> subArray(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subarray = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subarray.add(nums[j]);
                }
            }
            result.add(subarray);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subArray(nums);
        System.out.println(result);
    }
}
