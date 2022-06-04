public class BubbleSort {
    static int[] bubbleSort(int[] arr){
        final int END = arr.length-1;
        int temp;
        for(int i=0; i < END; i++){
            for (int j=0; j < END - i; j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    static int getMinIndex(int[] arr, int START){
        int minIndex = START;
        for (int i = START; i < arr.length; i++)
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        return minIndex;
    }

    static int[] selectionSort(int[] arr){
        int temp, minIndex=0;
        for (int i=0; i < arr.length - 1; i++){
            minIndex = getMinIndex(arr, i);
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr =  {2, 432, 43, 3, 247827, 7828, 2323};
        int [] sortedArr = selectionSort(arr);
        for (int x: sortedArr){
            System.out.print(x+" ");
        }
    }
}
