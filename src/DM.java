public class DM {

    static int getCount(String s, char c){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if (c==s.charAt(i)) count++;
        }
        return count;
    }

    static boolean isDistinct(int n){
        String s;
        s = String.valueOf(n);
        for (int i=0; i<s.length(); i++){
            if (getCount(s, s.charAt(i))>1) 
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        final int START = 1000, END = 10000;
        int count = 0;
        for(int i=START; i<END; i++){
            if (getCount(String.valueOf(i), '9')==3){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
