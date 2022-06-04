public class TwinPrimes {
    static boolean isPrime(int n){
        int sqrt = (int)(Math.sqrt(n));
        for (int x=2; x<=sqrt; x++){
            if (n%x==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {   
        System.out.println("All twin primes upto 1000 are: ");
        for (int i=5; i<1000; i++){
            if (isPrime(i-2) && isPrime(i)){
                System.out.printf("(%s, %s)\n", i-2, i);
            }
        }
    }
}
