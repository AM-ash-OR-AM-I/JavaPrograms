public class FindGCD {

    static int gcd(int divisor, int dividend){
        int remainder = 1;
        while (remainder!=0) {
            remainder = dividend % divisor;
            if (remainder!=0){
                dividend = divisor;
                divisor = remainder;
            }
        }
        return divisor;
    }

    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(hex));
        int g= gcd(54,27);
        System.out.println(g);
    }
}
