class Phone{
    void displayTime(){
        System.out.println("Current time is 1pm");
    }
    void aboutPhone(){
        System.out.println("This is a phone.");
    }
}

class Smartphone extends Phone{
    void aboutPhone(){
        System.out.println("This is a smartphone.");
    }

    void showFeatures(){
        System.out.println("You can wtach videos.");
    }
}
public class DynamicMethod {
    public static void main(String[] args) {
        Phone obj = new Smartphone();
        obj.displayTime();
        obj.aboutPhone();
        
    }
}
