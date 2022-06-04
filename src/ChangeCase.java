import java.util.Scanner;

public class ChangeCase{
    public static void main(String[] args) {
        int upper = 0, lower = 0, digit = 0;
        Scanner scanner =new Scanner(System.in);
        String string = scanner.next();
        for (int i=0; i<string.length(); i++){
            if (string.charAt(i)>='a' && string.charAt(i)<='z')
                lower++;
            else if (string.charAt(i)>='A' && string.charAt(i)<='Z')
                upper++;
            else if (string.charAt(i)>='0' && string.charAt(i)<='9')
                digit++;
        }
        System.out.println("No. of upper case charecters = "+upper);
        System.out.println("No. of lower case charecters = "+lower);
        System.out.println("No. of digits = "+digit);
    }
}