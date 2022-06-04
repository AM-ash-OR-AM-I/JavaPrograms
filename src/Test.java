interface CountNumbers{
    int[] arr = {12, 234, 4, 32432};
    public void countNumbers();
}

public class Test implements CountNumbers{
    public void countNumbers(){
        System.out.println("Total no. of elements in array is = "+arr.length);
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.countNumbers();
        System.out.println("Hello");
        System.out.println("Hi there...");
        System.out.println("Hi there");
    }
}
