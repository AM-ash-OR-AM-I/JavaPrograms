import java.util.Scanner;

public class Array2D{
    static int arr [][] = new int[3][3];

    public static void displaySum(){
        int sum  = 0;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
                if (i==j)
                    sum += arr[i][j];
            }
        System.out.println();
        }
        System.out.println("Sum of diaognal elements is = "+sum);
    }
    public static void main(String[] args) {
        System.out.println("Enter the elements of array row wise: ");
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                arr[i][j] = scanner.nextInt();
            }
            
        }
        displaySum();
    }
}