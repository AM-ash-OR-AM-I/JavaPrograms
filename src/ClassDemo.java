class Student {
    String name;
    private int roll, sec;

    Student(String name, int roll, int sec){
        this.name= name;
        this.roll = roll;
        this.sec = sec;
    }

    void printDetails(){
        System.out.println("Name = "+name+", Roll = "+roll+", Sec = "+sec);
    }

    int getRoll(){
        return roll;
    }
    
    void updateRoll(int roll){
        if (roll>0)
            this.roll = roll;
        else
            System.out.println("Invalid number, roll no. should be a +ve integer.");
    }

}

public class ClassDemo {

    public static void main(String[] args) {
        Student student1 = new Student("Ashutosh", 2141013014, 11);
        student1.printDetails();
        student1.updateRoll(120);
        int roll = student1.getRoll();
        System.out.println(roll);
//        testClass.name="As";
//        System.out.println(testClass.getConstructorName());
//        System.out.println(testClass.roll);
//        testClass
//        test
//        test.privateDef();
        
    }
}

