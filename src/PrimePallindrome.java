public class PrimePallindrome {

    static boolean isPrime(int n){
        int sqrt = (int)(Math.sqrt(n));
        for (int x=2; x<=sqrt; x++){
            if (n%x==0)
                return false;
        }
        return true;
    }

    static boolean isPalindrome(int n){
        String reversed = "";
        int actual_number = n;
        while (n>0){
            reversed += String.valueOf(n%10);
            n/=10;
        }
        return (Integer.parseInt(reversed) == actual_number);
    }
    public static void main(String[] args) {
        int counter = 0, END = 1000_000;
        double approx_primes = END/Math.log(END);
        System.out.println("Approx. no of primes = "+approx_primes);
        for(int i=2; i< END; i++){
            if (isPrime(i)){
                counter+=1;
            }
        }
        System.out.println("Actual no. of primes = "+counter);
        System.out.println("Ratio = "+counter/approx_primes);

    }
}
