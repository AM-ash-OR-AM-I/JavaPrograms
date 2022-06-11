import java.util.Scanner;

public class Binary {
    static String convertBinary(int n, String binary) {
        if (n == 0)
            return binary;
        return convertBinary(n / 2, n%2+binary);
    }

    public static void main(String[] args) {
        System.out.println(convertBinary(12, ""));
        Scanner sc = new Scanner(System.in);
        try {
            int d = sc.nextInt();
            if (d==0)
                throw new ArithmeticException("Can't divide by zero.");
            int i = 10 / d;
            System.out.println(i);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Program finished inside finally.");
        }
        // System.out.println("Program finished outside finally.");
    }
}
