import java.util.ArrayList;

class LinkedList<T> {
    class Node {
        Object data;
        Node next;
    }

    Node start;
    Node end;

    Node createNode(T data) {
        Node node = new Node();
        node.data = data;
        return node;
    }

    Node travelEnd() {
        Node cursor;
        if (end == null) {
            cursor = start;
            while (cursor.next != null) {
                cursor = cursor.next;
            }
        } else
            cursor = end;
        return cursor;
    }

    Node travelTo(int index) {
        Node cursor = start;
        int count = 0;
        while (++count < index) {
            cursor = cursor.next;
        }
        return cursor;
    }

    void insertEnd(T data) {
        Node addNode = createNode(data);
        if (start == null) {
            start = addNode;
        } 
        else{
            Node curr = travelEnd();
            curr.next = addNode;
            end = curr;
        }
    }

    void insertAny(int index, T data) {
        if (index != 0) {
            Node addNode = createNode(data);
            if (start == null)
                start = addNode;
            else{
                Node cursor = travelTo(index);
                addNode.next = cursor.next; // node.next was null and is now pointing to cursor.next
                cursor.next = addNode; // cursor.next now points to node
            }
        } else
            insertStart(data);
        System.out.println("After insertion at "+ index);
        display();

    }

    void insertStart(T data) {
        Node node = createNode(data);
        if (start != null)
            node.next = start;
        start = node;

    }

    void insertBefore(T data, T toSearch) {
        Node newNode = createNode(data);
        Node cursor1 = start, cursor2 = start;
        while (cursor2.data != toSearch && cursor2.next != null) {
            cursor1 = cursor2;
            cursor2 = cursor2.next;
        }
        newNode.next = cursor1.next;
        cursor1.next = newNode;
    }

    void insertAfter(T data, T toSearch) {
        Node newNode = createNode(data);
        Node cursor = start;
        while (cursor.data != toSearch && cursor.next != null) {
            cursor = cursor.next;
        }
        newNode.next = cursor.next; // New node now links with the next node.
        cursor.next = newNode; // Previous node now links with new node
    }

    void deleteNodeAt(int index) {
        if (index == 0) {
            start = start.next;
        } else {
            Node cursor = travelTo(index);
            cursor.next = cursor.next.next;
        }
        System.out.println("Linked list after deletion: ");
        display();
    }

    void display() {
        Node cursor = start;
        while (cursor.next != null) {
            System.out.print(cursor.data + " -> ");
            cursor = cursor.next;
        }
        System.out.print(cursor.data + "\n");
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