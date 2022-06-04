public class BinarySearch {
    static int binarySearch(int[] arr, int x) {
        int f = 0, l = arr.length;
        int mid = (f+l)/2;
        for (int i = 0; i < arr.length; i++) {
            mid = (f+l)/2;
            if (arr[i]==x)
                return i;
            else if (arr[i]>x)
                l = mid + 1;
            else
                f = mid - 1;
        }
        return -1;
    }
        
    public static void main(String[] args) {
        int[] arr = { 3, 34, 45, 232, 343 };
        System.out.println(binarySearch(arr, 232));
    }
}
