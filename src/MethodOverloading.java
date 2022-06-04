
class OverLoading {
    OverLoading(){
        System.out.println("Inside default constructor.");
    }

    OverLoading(String name){
        System.out.println("Inside String constructor "+ name);
    }

    void overloadedMethod(){
        System.out.println("Method is overloaded.");
    }

    void overloadedMethod(String name){
        System.out.println("Overloaded with String.");
    }

    void isOverride(){
        System.out.println("Method is not override");
    }
}

class OverrideClass extends OverLoading{

    void isOverride(){
        System.out.println("Override the method");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        OverLoading overLoading = new OverLoading();
        OverLoading overLoading1 = new OverLoading("Hello");
        overLoading.overloadedMethod();
        overLoading.overloadedMethod("HiThere");
        overLoading.isOverride();

        System.out.println();
        OverrideClass overrideClass = new OverrideClass();
        overrideClass.isOverride();

    }


}
