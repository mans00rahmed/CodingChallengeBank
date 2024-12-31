import java.util.*;

public class MostRepeat {
    public static Integer mostRepeat(int[] arr) {
        int most = 0;
        int currentCount = 0;
        for (int i : arr) {
            currentCount = 0;
            for (int k : arr) {
                if (k == i) {
                    currentCount++;
                    if (currentCount > most) {
                        most = k;
                    }
                }
            }
        }
        return most;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        Integer result = mostRepeat(arr);
        System.out.println("Most repeated: " + result);
    }
}
