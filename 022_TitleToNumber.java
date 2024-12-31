public class TitleToNumber {
    public static int titleToNumber(String columnTitle) {
        int[] asciiArray = columnTitle.chars().toArray();
        int total = 0;
        for (int ascii : asciiArray) {
            total = total * 26 + ((ascii - 64));
        }
        return (total);
    }

    public static void main(String[] args) {
        String columnTitle = "AB";
        int result = titleToNumber(columnTitle);
        System.out.println("Column title number: " + result);
    }
}
