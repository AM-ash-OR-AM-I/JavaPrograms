interface StackInterface<T>{
    void push(T data);
    void pop();
    void displayStack(String msg);
}

class Stack<T extends Comparable<T>> extends LinkedList<T> implements StackInterface<T>{
    int MAX_LENGTH;
    int length;
    Stack(int n){
        MAX_LENGTH = n;
    }
    public void push(T data) {
        if (length < MAX_LENGTH){
            length++;
            insertStart(data);
            displayStack(data+" is pushed.");
        }
        else {
            System.out.println("Overflow: Stack is already full.");
        }
    }

    public void pop() {
        if (start!=null){
            System.out.println("\nElement removed = "+start.data);
            start = start.next;
        }
        else {
            System.out.println("Underflow: Stack is Empty");
        }
    }
    public void displayStack(String msg){
        Node current = start;
        System.out.println("\nSTACK after "+msg);
        while (current!=null){
            if (current==start)
                System.out.printf("| %5s | --> TOP%n",current.data);
            else
                System.out.printf("| %5s |%n",current.data);
            current = current.next;
        }
    }
}

public class StackQueueLinkedList {
    public static void main(String[] args) {
        StackInterface<Integer> stack = new Stack<>(3);
        stack.push(24);
        stack.push(35);
        stack.push(64);
        stack.push(52343);
//        stack.pop();
//        stack.displayStack(52343+" is removed");
    }
}
