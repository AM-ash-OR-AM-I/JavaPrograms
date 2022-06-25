import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
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
        int forward = mid + 1, backward = mid, val;
        for (int i = 1; i <= n; i++) {
            val = ((i & 1) == 1) ? forward++ : backward--;
            System.out.print(val + ((i != n) ? " " : "\n"));
        }

    }

    static void possibleGCD() {
        int a = sc.nextInt(), b = sc.nextInt();
        int diff = Math.abs(a - b);
        int distinctGCD = 1 + (!(diff == 1) ? 1 : 0);
        for (int i = 2; i * i <= diff; i++) {
            if (i * i == diff)
                distinctGCD++;
            else if (diff % i == 0)
                distinctGCD += 2;
        }
        System.out.println(distinctGCD);
    }

    static void reduceToZero() {
        long x = sc.nextLong(), y = sc.nextLong();
        if (x == y)
            System.out.println(x);
        else if (x==0 || y==0)
            System.out.println(-1);
        else {
            long max = Math.max(x, y), min = Math.min(x, y);
            double power = Math.log(max / min) / Math.log(2);
            long multiplyBy2 = (long) power;
            if (multiplyBy2 == (long) (Math.ceil(power))) {
                System.out.println(max + multiplyBy2);
            } else
                System.out.println(-1);
        }

    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            reduceToZero();
        }

    }
}
