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
                    System.out.print("Enter the string: ");
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

class StackLList extends LinkedList<String> implements StackInterface{
    int MAX_LENGTH;
    int length;
    StackLList(int length){
        MAX_LENGTH = length;
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
                System.out.printf("| %-5s | --> TOP%n",current.data);
            else
                System.out.printf("| %-5s |%n",current.data);
            current = current.next;
        }
    }
}

interface QueueInterface{
    Scanner sc = new Scanner(System.in);
    String MENU = """
                ** QUEUE MENU **
                1. Enqueue
                2. Dequeue
                3. Display
                Any other number to show menu.
                """;
    void enqueue(String data);
    void dequeue();
    void displayQueue();
    default void menu(){
        System.out.println(MENU);
        int choice = 1;
        while(choice!=0){
            switch (choice){
                case 1 -> {
                    System.out.print("Enter the string: ");
                    String elem = sc.next();
                    enqueue(elem);
                }
                case 2 -> dequeue();
                case 3 -> displayQueue();
                default -> System.out.println(MENU);

            }
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
        }

    }
}

class QueueLList extends LinkedList<String> implements QueueInterface{
    int MAX_LENGTH, length;
    QueueLList(int length){
        this.MAX_LENGTH = length;
        menu();
    }
    @Override
    public void enqueue(String data) {
        if (length < MAX_LENGTH){
            length++;
            insertEnd(data);
        }
        else System.out.println("Queue is full can't add.");
    }

    @Override
    public void dequeue() {
        if (start!=null){
            length--;
            System.out.println("\nElement removed = "+start.data);
            start = start.next;
        }
        else System.out.println("Queue is already empty.");
    }

    @Override
    public void displayQueue() {
        Node current = start;
        System.out.println("\n::QUEUE::");
        String msg;
        while (current!=null){
            if (start==end)
                System.out.printf("| %-5s | -> FRONT & REAR %n", current.data);
            else if (current==start)
                System.out.printf("| %-5s | -> FRONT%n", current.data);
            else if (current.next==null)
                System.out.printf("| %-5s | -> REAR%n", current.data);
            else
                System.out.printf("| %-5s |%n", current.data);
            current = current.next;
        }
    }
}

public class StackQueueLinkedList {
    public static void main(String[] args) {
        StackInterface stack = new StackLList(3); // Gives access to only methods of stack.
        QueueInterface queue = new QueueLList(3); // Gives access to only methods of queue.
    }
}
