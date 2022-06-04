public class Array2DTest {
    static void printArr(int[][] arr){
        for(int row=0; row<arr.length; row++){
            for (int col = 0; col< arr[row].length; col++ ){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }

    static int[] reversedArr(int [] arr){
        int temp, len = arr.length;

        for (int index = 0; index < len/2; index++){
            temp = arr[index];
            arr[index] = arr[len - index -1];
            arr[len - index -1] = temp;
        }
        return arr;

    }

    public static void main(String[] args) {
        int [][] matrix1 = {
            {1, 3, 5},
            {4, 7, 9},
            {4, 57, 97},
            {823, 243, 34}
        };
        int [][] matrix2 = {
            {4, 6, 7},
            {5, 9, 8},
            {2342, 242, 21},
            {22, 242, 27},
        };
        // reversedArr(matrix1);
        int [][] sum = new int[matrix1.length][matrix1[0].length];

        for(int row=0; row< matrix1.length; row++){
            for (int col=0; col< matrix1[row].length; col++){
                sum[row][col] = matrix1[row][col]+matrix2[row][col];
            }
        }

        int arr[]= {923,2342,23};
        int reversed []= reversedArr(arr);
        for(int x: reversed){
            System.out.print(x+" ");
        }

        // printArr(sum);


    }
    
}
