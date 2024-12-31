import java.util.*;

public class MinMax {
    public static int[] minmax(int[] list) {
        Arrays.sort(list);
        int[] sortedArray = Arrays.copyOf(list, list.length);
        int left = 0;
        int right = list.length - 1;

        for (int i = 0; i < list.length; i += 2) {
            if (i + 1 < list.length) {
                sortedArray[i + 1] = list[right--];
            }
            sortedArray[i] = list[left++];
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int[] result = minmax(list);
        System.out.println(Arrays.toString(result));
    }
}
