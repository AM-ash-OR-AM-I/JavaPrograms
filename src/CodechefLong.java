import java.util.ArrayList;
import java.util.Scanner;

public class CodechefLong {
    static Scanner sc = new Scanner(System.in);

    static void subscription() {
        double n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println((int) (Math.ceil(n / 6) * x));
    }

    static void alternateAddition() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = b - a;
        System.out.println((diff % 3 == 0 || diff % 3 == 1) ? "yes" : "no");
    }

    static void equalStrings() {
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        char x;
        ArrayList<Character> prev = new ArrayList<>();
        int op = 0;
        for (int i = 0; i < n; i++) {
            x = b.charAt(i);
            if (a.charAt(i) != x) {
                if (!prev.contains(x)) {
                    op++;
                }
                prev.add(x);
            }
        }
        System.out.println(op);
    }

    static void divisibleByI() {
        int n = sc.nextInt();
        int mid = n / 2;
        int forward = mid+1, backward = mid+1;
        int val = forward;
        for (int i = 1; i <= n; i++) {
            if ((i & 2) == 1)
                val = ++forward;
            else
                val = --backward;
            System.out.print(val + ((i != n) ? " " : "\n"));
        }

    }

    public static void main(String[] args) {
        try {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                divisibleByI();
            }
        } finally {
            sc.close();
        }

    }
}
