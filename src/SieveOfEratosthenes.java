import java.util.Scanner;

public class SieveOfEratosthenes {
    static int primeCount = 0;
    static boolean isPrime(int n){
        int sqrt = (int)(Math.sqrt(n));
        for (int x=2; x<=sqrt; x++){
            if (n%x==0)
                return false;
        }
        return true;
    }
    
    static void checkBasePrime(int[] basePrimes, int x){
        for (int p: basePrimes){
            if (p!=0 && x%p==0)
            return;
        }
        primeCount++;
        // System.out.print(x+" ");
    }
    static void allPrimes(int x){
        int sqrt = (int)(Math.sqrt(x));
        int [] basePrimes = new int[(int) (sqrt/Math.log(sqrt)*1.5)];
        for (int i = 2; i<=sqrt; i++){
            if (isPrime(i)){
                basePrimes[primeCount++] = i;
                // System.out.print(i+" ");
            }
        }
        for (int i = sqrt+1; i<=x ; i++){
            checkBasePrime(basePrimes, i);
        }
    }

    static void naivePrimes(int x){
        int counter= 0;
        for(int i=2; i< x; i++){
            if (isPrime(i)){
                counter+=1;
            }
        }
        System.out.println("Naive Count = "+ counter);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter range to find all prime no.s: ");
        int x = scanner.nextInt();
        allPrimes(x);
        System.out.println("\nNo. of Primes = "+primeCount);
        System.out.println("Approx prime count = "+ (int)(x/Math.log(x)));
        naivePrimes(x);
    }    
}
