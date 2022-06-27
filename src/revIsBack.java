import java.util.Random;
import java.util.Scanner;

class Reversing {
    public static String function(String messAGE) {
        char[] array = messAGE.toCharArray();
        int[] randoms = new int[6];
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            randoms[i] = rand.nextInt(9); // 0-8
        }
        int j = 0;
        for (char b : array) {
            System.out.print(array[j] + " ");
            array[j] = (char) (randoms[j % 6] + b);
            System.out.print(randoms[j % 6] + "\n");
            j++;
        }
        System.out.println();
        for (int i2 = 0; i2 < array.length; i2++) {
            if (i2 % 2 == 0) {
                array[i2] = (char) (array[i2] ^ 2);
            }
        }
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : array) {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    public static void reverse(String messAGE) {
        char[] array = messAGE.toCharArray();
        for (int i2 = 0; i2 < array.length; i2++) {
            if (i2 % 2 == 0) {
                array[i2] = (char) (array[i2] ^ 2);
            }
            // System.out.print(array[i2] + " ");
        }
        for (int m = 0; m < 9; m++)
            for (int n = 0; n < 9; n++) {
                int[] rand = { 8, 8, 5, 1, m, n }; // 8 3 3 0 2 0
                // if (i == 8 && j == 3 && k == 3 && l == 0 && m == 2)
                // System.out.println("Found");
                char[] arr1 = array.clone();
                for (int a = 0; a < array.length; a++) {
                    arr1[a] = (char) (array[a] - rand[a % 6]);
                    // System.out.print(array[j] + " ");
                }

                StringBuilder stringBuilder = new StringBuilder();
                for (char ch : arr1) {
                    stringBuilder.append(ch);
                }
                String s = stringBuilder.toString();
                // System.out.println(stringBuilder);
                if (s.startsWith("codex")) {
                    System.out.println("Found " + stringBuilder);
                    for (int x : rand) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                }
            }

        // return stringBuilder.toString();
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter The Flag: ");
        // String s=sc.nextLine();
        // first 5 characters of flag are codex
        // String res = function("Hi there");
        // System.out.println(res);
        // reverse(res);
        // System.out.println((char)('b'^2));
        // System.out.println((char)('`'^2));
        // reverse("iwkfC^NS9V9ZZ2TGeK;OeB9g:5YY");
        for (int i = 112; i < 130; i++) {
            System.out.println((char)i);
        }
        // if(function(s).equals("iwkfC^NS9V9ZZ2TGeK;OeB9g:5YY"))
        // {
        // System.out.println("Flag Found: "+s);
        // }
        // else{
        // System.out.println("Invalid Flag !!");
        // }
        // sc.close();
    }
}