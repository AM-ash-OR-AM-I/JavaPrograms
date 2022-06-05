public class SieveEratosthenes {
    int count, n;
    boolean arr[], set;

    SieveEratosthenes(int n){
        this.n = n;
        arr = new boolean[n+1]; // Everything is False by default
    }

    void setMultiplesTrue(int x){
        for (int i= x*x; i<=n;i+=x){
            arr[i] = true;
        }
        
    }

    private void setallPrimes(){
        set = true;
        for (int x=2; x*x<=n; x++){

            if (!arr[x])
                setMultiplesTrue(x);
        }
    }

    void displayPrimes(){
        setallPrimes();
        for (int x=2; x<n; x++){
            if (!arr[x]){
                count++;
                System.out.print(x+" ");
            }
        }
    }

    void getCountOfPrimes(){
        if (!set)
            setallPrimes();
        if (count==0)
            for (int x=2; x<n; x++)
                if (!arr[x]) count++;
        System.out.println("Count = "+count);
    }


    public static void main(String[] args) {
        int x = 100_000;
        SieveEratosthenes sieve = new SieveEratosthenes(x);
        sieve.displayPrimes();
        sieve.getCountOfPrimes();
    }
}
