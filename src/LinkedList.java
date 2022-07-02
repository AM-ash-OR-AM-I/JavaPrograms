public class LinkedList<T extends Comparable<T>> {
    class Node {
        T data;
        Node next;
        Node(T data){
            this.data = data;
        }
    }
    Node start, end;

    public int length(){
        // Gets the length of linked list
        Node current = start;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    Node travelEnd() {
        Node current = start;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    Node travelTo(int index) {
        Node current = start;
        int count = 0;
        while (++count < index) {
            current = current.next;
        }
        return current;
    }

    public void insertEnd(T data) {
        // Inserts at end of Linked List
        Node addNode = new Node(data);
        if (start == null) {
            start = end = addNode;
        } else {
            Node current;
            if (end != null)
                current = end;
            else
                current = travelEnd(); // End value not initialised so travel till end.
            current.next = addNode;
            end = addNode;
        }
    }

    public void insertAny(int index, T data) {
        // Inserts at any index in Linked List
        if (index != 0) {
            Node addNode = new Node(data);
            if (start == null)
                start = addNode;
            else {
                Node current = travelTo(index);
                addNode.next = current.next; // node.next was null and is now pointing to current.next
                current.next = addNode; // current.next now points to node
            }
        } else
            insertStart(data);
    }

    public void insertStart(T data) {
        // Insert at the beginning of the Node
        Node node = new Node(data);
        if (start != null)
            node.next = start;
        start = node;
    }

    public void insertBefore(T data, T toSearch) {
        // Insert before given Element
        Node newNode = new Node(data);
        Node current1 = start, current2 = start;
        while (current2.data != toSearch && current2.next != null) {
            current1 = current2;
            current2 = current2.next;
        }
        newNode.next = current1.next;
        current1.next = newNode;
    }

    public void insertAfter(T data, T toSearch) {
        // Insert after given Element
        Node newNode = new Node(data);
        Node current = start;
        while (current.data != toSearch && current.next != null) {
            current = current.next;
        }
        newNode.next = current.next; // New node now links with the next node.
        current.next = newNode; // Previous node now links with new node
    }

    public void deleteNodeAt(int index) {
        // Delete node at any index
        if (index == 0) {
            start = start.next;
        } else {
            Node current = travelTo(index);
            current.next = current.next.next;
        }
        System.out.println("Linked list after deletion: ");
    }

    void swap(Node node1, Node node2){
        T temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }

    void sort(){
        int n = length();
        Node current;
        for (int i = 0; i < n - 1; i++) {
            current = start;
            for (int j = 0; j < (n - i - 1); j++) {
                if (current.data.compareTo(current.next.data) > 0){
                    swap(current, current.next);
                }
                current = current.next;
            }
//            display(String.format("Linked List at %sth step", i+1));
        }
    }

    void reverse(){
        Node p = start, q = p.next, r = q.next;
        p.next = null;
        q.next = p;
        while (r!=null){
            p = q;
            q = r;
            r = r.next;
            q.next = p;
        }
        start = q;
    }

    public void display(String message) {
        System.out.println(message);
        Node current = start;
        while (current.next != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print(current.data + "\n");
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        String[] arr = {"a","bc","ac","abc"};
        for(int i = 0; i< arr.length; i++){
            l.insertEnd(arr[i]);
        }
        l.display("Linked list Before Sorting: ");
        l.sort();
        l.display("Linked List After sorting: ");
        l.reverse();
        l.display("Linked List after reverse: ");
    }
}