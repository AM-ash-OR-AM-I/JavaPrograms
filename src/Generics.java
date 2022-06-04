class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display(){
        System.out.printf("x = %s, y = %s\n",x,y);
    }
}

class Generic<Type1, Type2> {
    Type1 type1;
    Type2 type2;

    void setVar(Type1 t1, Type2 t2) {
        type1 = t1;
        type2 = t2;
    }
    
    Type1 getType1() {
        return type1;
    }

}

public class Generics {
    public static void main(String[] args) {
        Point p = new Point(56, 23);
        Generic <Point, String> generic = new Generic<>();
        generic.setVar(p, "Hi there");
        Point pt = generic.getType1();
        pt.display();

    }
}
