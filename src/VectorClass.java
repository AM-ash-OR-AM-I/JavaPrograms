import java.util.Scanner;
import java.util.Vector;

public class VectorClass {
    public static void main(String[]args) {
        Vector StudentInfo = new Vector();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your rollno: ");
        Integer rollno = scanner.nextInt();
        System.out.println("Enter your subject: ");
        String subject = scanner.next();
        System.out.println("Enter your name: ");
        String name = scanner.next();
        StudentInfo.addElement(rollno);
        StudentInfo.addElement(name);
        StudentInfo.addElement(subject);
        System.out.println("Vector = "+StudentInfo);
    }
}
