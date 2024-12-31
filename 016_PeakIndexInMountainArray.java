public class PeakIndexInMountainArray {
    public static int peakIndexInMountainArray(Integer[] arr) {
        int min = 0;
        int max = arr.length - 1;

        while (min < max) {
            int mid = min + (max - min) / 2;
            if (arr[mid] < arr[mid + 1]) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return arr[min];
    }

    public static void main(String[] args) {
        Integer[] arr = {0, 2, 4, 6, 3, 1};
        int peakIndex = peakIndexInMountainArray(arr);
        System.out.println("Peak index: " + peakIndex);
    }
}
