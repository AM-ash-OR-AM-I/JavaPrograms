import java.math.BigInteger;

public class FibonacciTest {
    static BigInteger fib(long n) {
        BigInteger first = new BigInteger("1");
        BigInteger last = new BigInteger("1");
        BigInteger temp = new BigInteger("1");
        for (int i = 1; i < n; i++) {
            temp = first;
            first = last;
            last = temp.add(first);
        }
        return first;
    }
    public static void main(String[] args) {
        for (int i=1; i<2000;i++){
            System.out.println(i+" "+fib(i));
        }
    }
}
