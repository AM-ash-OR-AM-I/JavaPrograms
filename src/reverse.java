import java.util.Scanner;                                                                                               
class Demo {
    public static String function(String messAGE) {
        char[] array = messAGE.toCharArray();
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += (char) ((i % 2 == 0) ? array[i] - 1 : array[i] + 1);
        }
        return result;

    }
    public static String reverse(String messAGE) {
        char[] array = messAGE.toCharArray();
        String result="";
        for (int i=0;i<array.length;i++) {
            result += (char)((i%2==0)?array[i]+1:array[i]-1);
        }
        return result;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Flag: ");
        String s=sc.nextLine();
        if(function(s).equals("bpcfwDSGzB^T0NOM2`Q4U4Q6@M|"))
        {
            System.out.println("Flag Found: "+s);
        }
        else{
            System.out.println("Invalid Flag !!");
        }
        sc.close();
        // System.out.println(reverse("bpcfwDSGzB^T0NOM2`Q4U4Q6@M|"));
    }
}