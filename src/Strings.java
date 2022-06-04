public class Strings{
    public static void main(String[]args) {
        String s1="Mango";
        String s2="Apple";
        String s3="Banana";
        StringBuffer str = new StringBuffer("Hello");
        str.append("hi");
        
        System.out.println(str);
        // s1 = s1.trim();
        // System.out.println(s1==s2);
        // System.out.println(s1.equals(s2));
        int v1= s1.compareTo(s2);
        int v2= s1.compareTo(s3);
        int v3= s3.compareTo(s2);
        if (v1<0 && v2<0){
            System.out.println(s1);
            if (v3<0){
                System.out.println(s3);
                System.out.println(s2);
            }
            else{
                System.out.println(s2);
                System.out.println(s3);
            }
        }

        else if (v1>0 && v3>0){
            if (v2>0){
            }
        }

        // System.out.println(s1.substring(0,5));
        // System.out.println(s1.concat(s2));
        // System.out.println(s1.substring(3)); // same as s1[3:] in python
        // System.out.println(s1.compareTo(s2));
        System.out.println(s1);
        
        
    }
}