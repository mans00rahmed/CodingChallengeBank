public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        long i = 1;
        while (i < n) {
            i = i * 2;
        }
        if (i == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 16;
        boolean result = isPowerOfTwo(n);
        System.out.println("Is power of two: " + result);
    }
}
