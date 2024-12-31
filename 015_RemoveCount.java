import java.util.*;

public class RemoveCount {
    public static void removeCount(int[] originalArray) {
        HashSet<Integer> set = new HashSet<>();
        for (int value : originalArray) {
            set.add(value);
        }
        System.out.println(set + "set");
        int[] newArray = new int[set.size()];
        int index = 0;
        for (int value : set) {
            newArray[index++] = value;
        }

        int countRemoved = originalArray.length - newArray.length;
        System.out.println(countRemoved);
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 2, 3, 4, 4, 5};
        removeCount(originalArray);
    }
}
