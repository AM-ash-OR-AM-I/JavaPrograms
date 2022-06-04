public class CountOccurences {
    public static int count(String str, char a){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i)==a)
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s= "Hello There Ash here";
        System.out.println(count(s, 'e'));
    }
}
