public class CodingProblems{
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left != right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
}