public class Areas {
    void calculateArea(float a){
        System.out.println("Area of Square = "+(a*a));
    }

    void calculateArea(double a){
        System.out.println("Area of Circle = "+(Math.PI*a*a));
    }

    void calculateArea(double a, double b){
        System.out.println("Area of Rectangle = "+(a*b));
    }
    
    void calculateArea(double a, double b, double c){
        double s = (a+b+c)/2;
        System.out.println("Area of Triangle = "+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }

    public static void main(String[] args) {
        Areas triangle = new Areas();
        Areas square = new Areas();
        Areas circle = new Areas();
        Areas rectangle = new Areas();
        triangle.calculateArea(2, 3, 4);
        square.calculateArea(5);
        circle.calculateArea(5.5d);
        rectangle.calculateArea(4, 5);
        
    }
}
