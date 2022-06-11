class Test1 {
    int i;
    static double d;
}

public class DSA_Test {
    static <T extends Comparable<T>> T findGreater(T t1, T t2){
        if (t1.compareTo(t2)>0)
            return t1;
        else
            return t2;
    }
    public static void main(String[] args) {
        System.out.println(findGreater(343,453));
    }
}
