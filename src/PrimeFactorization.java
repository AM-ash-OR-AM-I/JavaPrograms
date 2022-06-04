import java.util.Scanner;

public class PrimeFactorization {
    
    static boolean isPrime(int n){
        int sqrt = (int)(Math.sqrt(n));
        for (int x=2; x<=sqrt; x++){
            if (n%x==0)
                return false;
        }
        return true;
    }

    static int[] getFactors(int n){
        int x = 2, index = 0;
        int [] factors = new int[ (int) (Math.log(n)/Math.log(2))];
        while (n!=1){
            if (n % x==0){
                factors[index++] = x;
                n/=x;
            }
            else x++;
        }
        
        return factors;
        
    }
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        if (!isPrime(n)) {
            int[] arr = getFactors(n);
            for (int x: arr){
                if (x!=0) System.out.print(x+" ");
                else break;
            }
        }
        else System.out.println("It is prime");
    }
}
