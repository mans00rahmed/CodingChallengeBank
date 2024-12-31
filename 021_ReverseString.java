public class ReverseString {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        for (int i = 0; i < (s.length) / 2; i++) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }
}
