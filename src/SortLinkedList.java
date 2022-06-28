class BubbleSortArray<T extends Comparable<T>> {
    T[] arr;

    BubbleSortArray(T[] arr) {
        this.arr = arr;
    }

    public void swap(int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0)
                    swap(j, j + 1);
            }
        }
        display();
    }

    public void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class BubbleSortLinkedList<T extends Comparable<T>> {
    LinkedList<T> linkedList;
    LinkedList<T>.Node start = linkedList.start;
    LinkedList<T>.Node current;
    BubbleSortLinkedList(LinkedList<T> linkedList){
        this.linkedList = linkedList;
    }

    void swap(LinkedList<T>.Node node1, LinkedList<T>.Node node2){
        T temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }

    void sort(){
        int n = linkedList.length();
        current = start;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (current.data.compareTo(current.next.data) > 0)
                    swap(current, current.next);
                current = current.next;
            }
        }
    }


}


class SortArray {
    public static void main(String[] args) {
        Double[] arr = { 423.2, 2312.23, 243.324, 324.2 };
        BubbleSortArray<Double> bubbleSort = new BubbleSortArray<>(arr);
        bubbleSort.sort();
//        BubbleSortLinkedList<Integer> bubbleSortLinkedList = new BubbleSortLinkedList<>()

    }
}
