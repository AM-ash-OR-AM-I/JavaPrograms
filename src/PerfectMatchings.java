public class PerfectMatchings {
    static int perfectMatching(int n) {
        if (n==2) return 1;
        return (n-1)*perfectMatching(n-2);
    }
    public static void main(String[] args) {
        System.out.println(perfectMatching(14));
    }
}
