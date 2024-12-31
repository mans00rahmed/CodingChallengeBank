import java.util.*;

public class UncommonCharacters {
    public static String uncommonCharacters(String s1, String s2) {
        ArrayList<Character> los1 = convertStringToArrayOfString(s1);
        ArrayList<Character> los2 = convertStringToArrayOfString(s2);
        ArrayList<Character> cofnis = new ArrayList<>();
        ArrayList<Character> cosnif = new ArrayList<>();
        for (Character i : los1) {
            if (!los2.contains(i)) {
                cofnis.add(i);
            }
        }

        for (Character i : los2) {
            if (!los1.contains(i)) {
                cosnif.add(i);
            }

        }
        return new String(mergeAndSort(cofnis, cosnif));
    }

    public static char[] mergeAndSort(ArrayList<Character> arr1, ArrayList<Character> arr2) {
        Set<Character> set = new HashSet<>();

        set.addAll(arr1);
        set.addAll(arr2);

        char[] mergedArray = new char[set.size()];
        int index = 0;
        for (char c : set) {
            mergedArray[index++] = c;
        }

        Arrays.sort(mergedArray);
        return mergedArray;
    }

    public static ArrayList<Character> convertStringToArrayOfString(String s) {
        char[] charArray = s.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (char c : charArray) {
            arrayList.add(c);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "defgh";
        String result = uncommonCharacters(s1, s2);
        System.out.println("Uncommon characters: " + result);
    }
}
