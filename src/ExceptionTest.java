class DivisionByZeroException extends Exception {
    DivisionByZeroException(String str) {
        super(str);
    }
}

public class ExceptionTest {
    static double methodException(double a, double b) throws DivisionByZeroException {
        if (b==0){
            throw new DivisionByZeroException("Division by zero, not allowed.");
        }
        return a/b;
    }

    public static void main(String[] args){
        try{
            double res = methodException(5, 0);
            System.out.println(res);
        }
        catch (DivisionByZeroException e){
            System.out.println(e.toString());
        }

    }
}
