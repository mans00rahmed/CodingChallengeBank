import java.util.*;

public class Spins {
    static int sumMaxValues = 0;

    public static void spins(String[] list) {
        ArrayList<Integer> maxValues = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                int maxDigit = Integer.MIN_VALUE;
                int maxDigitIndex = -1;
                for (int j = 0; j < list[i].length(); j++) {
                    int currentDigit = Character.getNumericValue(list[i].charAt(j));
                    if (currentDigit > maxDigit) {
                        maxDigit = currentDigit;
                        maxDigitIndex = j;
                    }
                }
                if (maxDigitIndex != -1) {
                    list[i] = list[i].substring(0, maxDigitIndex) + list[i].substring(maxDigitIndex + 1);
                }
                maxValues.add(maxDigit);
            }
        }

        System.out.println("Max values from each string: " + maxValues);

        int max = Collections.max(maxValues);
        System.out.println("Maximum value from maxValues list: " + max);

        sumMaxValues += max;

        boolean elementsLeft = false;
        for (String s : list) {
            if (s != null && !s.isEmpty()) {
                elementsLeft = true;
                break;
            }
        }

        if (elementsLeft) {
            spins(list);
        }
    }

    public static void main(String[] args) {
        String[] list = {"345", "67", "89"};
        spins(list);
    }
}
