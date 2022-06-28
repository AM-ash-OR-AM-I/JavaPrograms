public class LinkedList<T> {
    class Node {
        T data;
        Node next;
    }
    Node start, end;

    public int length(){
        Node current = start;
        int count = 0;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    Node createNode(T data) {
        Node node = new Node();
        node.data = data;
        return node;
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
        Node addNode = createNode(data);
        if (start == null) {
            start = addNode;
        } else {
            Node current;
            if (end != null)
                current = end;
            else
                current = travelEnd(); // End value not initialised so travel till end.
            current.next = addNode;
            end = current;
        }
    }

    public void insertAny(int index, T data) {
        if (index != 0) {
            Node addNode = createNode(data);
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
        Node node = createNode(data);
        if (start != null)
            node.next = start;
        start = node;
    }

    public void insertBefore(T data, T toSearch) {
        Node newNode = createNode(data);
        Node current1 = start, current2 = start;
        while (current2.data != toSearch && current2.next != null) {
            current1 = current2;
            current2 = current2.next;
        }
        newNode.next = current1.next;
        current1.next = newNode;
    }

    public void insertAfter(T data, T toSearch) {
        Node newNode = createNode(data);
        Node current = start;
        while (current.data != toSearch && current.next != null) {
            current = current.next;
        }
        newNode.next = current.next; // New node now links with the next node.
        current.next = newNode; // Previous node now links with new node
    }

    public void deleteNodeAt(int index) {
        if (index == 0) {
            start = start.next;
        } else {
            Node current = travelTo(index);
            current.next = current.next.next;
        }
        System.out.println("Linked list after deletion: ");
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
        LinkedList<Integer> l = new LinkedList<>();
        l.insertEnd(34);
        l.insertEnd(45);
        l.insertEnd(55); // Inserts at last by default
        l.insertAny(1, 65); // Inserts at any index in Linked List
        l.insertAfter(50, 45);
        l.insertBefore(40, 45);
        l.deleteNodeAt(4);
    }
}