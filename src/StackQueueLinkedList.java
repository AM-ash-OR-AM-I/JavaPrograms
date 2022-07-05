import java.util.Scanner;

interface StackInterface{
    String MENU = """
                ** STACK MENU **
                1. PUSH
                2. POP
                3. DISPLAY
                Any other number to show menu.
                """;
    Scanner sc = new Scanner(System.in);
    void push(String data);
    void pop();
    void displayStack();
    default void menu(){
        System.out.println(MENU);
        int choice = 1;
        while(choice!=0){
            switch (choice){
                case 1 -> {
                    System.out.print("Enter the number: ");
                    String elem = sc.next();
                    push(elem);
                }
                case 2 -> pop();
                case 3 -> displayStack();
                default -> System.out.println(MENU);

            }
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
        }

    }
}

interface QueueInterface{
    void enqueue(String data);
    void dequeue();
    void displayQueue();
}

class Stack extends LinkedList<String> implements StackInterface{
    int MAX_LENGTH;
    int length;
    Stack(int n){
        MAX_LENGTH = n;
        menu();
    }
    public void push(String data) {
        if (length < MAX_LENGTH){
            length++;
            insertStart(data);
        }
        else {
            System.out.println("\nOverflow: Stack is already full.");
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
    public void displayStack(){
        Node current = start;
        System.out.println("\n::STACK::");
        while (current!=null){
            if (current==start)
                System.out.printf("| %5s | --> TOP%n",current.data);
            else
                System.out.printf("| %5s |%n",current.data);
            current = current.next;
        }
    }
}


class Queue extends LinkedList<String> implements QueueInterface{

    @Override
    public void enqueue(String data) {
        insertEnd(data);
    }

    @Override
    public void dequeue() {
        if (start!=end){
            System.out.println("\nElement removed = "+start.data);
            start = start.next;
        }
        else {
            System.out.println("Queue is empty.");
        }
    }

    @Override
    public void displayQueue() {
        Node current = start;
        System.out.println("\n::QUEUE::");
        while (current!=null){
            if (start==end)
                System.out.printf("| %5s | --> FRONT & REAR %n",current.data);
            else if (current==start)
                System.out.printf("| %5s | --> FRONT%n",current.data);
            else if (current.next==null)
                System.out.printf("| %5s | --> REAR%n",current.data);
            else
                System.out.printf("| %5s |%n",current.data);
            current = current.next;
        }
    }
}

public class StackQueueLinkedList {
    public static void main(String[] args) {
//        StackInterface stack = new Stack(3); // Gives access to only methods of stack.
        QueueInterface queue = new Queue();
        queue.enqueue("234");
        queue.displayQueue();
        queue.enqueue("53");
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();
    }
}
