public class PallindromeCheckStack {
    static int top = -1;
    static int MAX_LENGTH = 30;
    static char stack[] = new char[MAX_LENGTH];

    static void push(char x) {
        stack[++top] = x;
    }

    static char pop() {
        char removed = stack[top--];
        return removed;
    }

    static boolean isPalindrome(String s) {
        for (int i = s.length() / 2; i < s.length(); i++) {
            push(s.charAt(i));
        }
        for (int i = 0; i < s.length() / 2; i++)
            if (pop() != s.charAt(i)) {
                return false;
            }
        return true;
    }

    static boolean isPrime(int x) {
        for (int i = 2; (i * i) <= x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    static int largestPrime(int[] arr) {
        int largestPrime = -1;
        for (int x : arr) {
            if (isPrime(x))
                largestPrime = Math.max(x, largestPrime);
        }
        return largestPrime;
    }

    static int search(int[] arr, int i, int target) {
        if (target == arr[i])
            return i;
        else if (i == arr.length) {
            return -1;
        } else
            return search(arr, i + 1, target);

    }

    static int find2ndMax(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int x : arr)
            if (x > max1)
                max1 = x;
        for (int x : arr)
            if (x != max1 && x > max2)
                max2 = x;

        return max2;

    }

    public static void main(String[] args) {
        String s = "rac23car";
        // int[] arr = { 45233, 127, 3412, 23, 73, 4363};
        // System.out.println("2nd max = "+find2ndMax(arr));
        // System.out.println("Element is found at :"+search(arr, 0, 127));
        // System.out.println("Largest prime = "+largestPrime(arr));
        System.out.println(isPalindrome(s));
    }
}
