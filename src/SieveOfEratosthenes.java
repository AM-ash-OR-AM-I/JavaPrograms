import java.util.Scanner;

/* It is used to find all prime numbers. */

class Sieve {
    int n;
    boolean[] primeArr;
    Sieve(int n){
        this.n = n;
        primeArr = new boolean[n+1];
    }
    
    private static boolean isPrime(int x){
        for (int i=2; i*i<=x; i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
    private void setMultiplesTrue(int x){
        for (int i=x*x; i<=n; i+=x){
            // int i = 2*x can also be written but, it's less efficient.
            primeArr[i]=true;
        }
    }
    private void allPrimes(){
        // Primes that are less than square root of n
        // Like for n=100 it's 2, 3, 5, 7 are basePrimes

        for (int i=2; i*i<=n; i++){
            if (!primeArr[i])
                // Sets value of multiples of base primes as true.
                setMultiplesTrue(i);
        }

    }

    void checkGreatestWall(){
        int[] arr = {6, 9, 20};
        for (int x: arr)
            setMultiplesTrue(x);
    }

    int countPrimes(){
        allPrimes();
        int primes = 0;
        for (int i=2; i<=n; i++)
            if (!primeArr[i])
                primes++;
        return primes;
    }

    void displayPrimes(){
        allPrimes();
        int primes = 0;
        for (int i=2; i<=n; i++)
            if (!primeArr[i])
                System.out.print(i+" ");
    }

    void naivePrimes(int x){
        int counter= 0;
        for(int i=2; i<x; i++){
            if (isPrime(i)){
                counter+=1;
            }
        }
        System.out.println("Naive Count = "+ counter);
    }
}

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sieve sieve = new Sieve(100);
        sieve.checkGreatestWall();
        sieve.displayPrimes();
//        System.out.println("Approx prime count = "+ (int)(x/Math.log(x)));
    }
}