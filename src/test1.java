class LongestSubarray {
    public static void main(String[] args) {
        // int[] arr = { 1, 1, 2, 3, 4, 5, 5, 5, 6 };
        int[] arr = { 32, 1, 5, 5, 32, 34, 5, 2, 5, 6 };
        longest(arr);
    }

    public static void longest(int arr[]) {
        int count = 1;
        int maxCount = 1;
        int element = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    element = arr[i];
                }
                maxCount = Math.max(count, maxCount);
                count = 1;
            }
        }
        System.out.print("[" + element);
        for (int i = 0; i < maxCount - 1; i++) {
            System.out.print(", " + element);
        }
        System.out.println(']');
    }
}