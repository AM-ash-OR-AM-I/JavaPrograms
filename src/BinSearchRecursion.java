public class BinSearchRecursion {
    static int binSearch(int[] arr, int target, int i, int j) {
        if (i <= j) {
            int mid = (i + j) / 2;
            if (target == arr[mid])
                return mid;
            else if (target > arr[mid])
                return binSearch(arr, target, mid + 1, j);
            else
                return binSearch(arr, target, i, mid - 1);
        } else
            return -1;
    }

    static void bubbleSort(int[] arr, int n, int i, int j){
        if (i==n)
            return;
        else if (j==n-i-1)
            bubbleSort(arr, n, i + 1, 0);
        else {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubbleSort(arr, n, i, j+1);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = { 424545, 3, 245, 4532, 32, 3424, 12, 35432513 };
        bubbleSort(arr, arr.length, 0, 0);
        for (int x : arr) {
            System.out.print(x+" ");
        }
        // System.out.println("Element is present at: "+binSearch(arr, 4366, 0, arr.length-1));
    }
}
