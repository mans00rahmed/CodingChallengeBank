public class CodingProblems{

    public static String FindDistinct(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    break;
                }
            }
            return arr[i];
        }
        return null;
    }
}