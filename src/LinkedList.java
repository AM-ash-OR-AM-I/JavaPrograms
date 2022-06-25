import java.util.ArrayList;

class Node {
    Object data;
    Node next;
}

class LinkedList<T> {
    Node start;
    Node end;

    Node createNode(T data) {
        Node node = new Node();
        node.data = data;
        return node;
    }

    void travel(Node addNode) {
        Node cursor;
        if (end == null) {
            cursor = start;
            while (cursor.next != null) {
                cursor = cursor.next;
            }
        } else
            cursor = end;
        cursor.next = addNode;
        end = cursor;
    }

    void travel(Node addNode, int index) {
        Node cursor = start;
        int count = 0;
        while (++count < index) {
            cursor = cursor.next;
        }
        addNode.next = cursor.next; // node.next was null and is now pointing to cursor.next
        cursor.next = addNode; // cursor.next now points to node
    }

    void insert(T data) {
        Node node = createNode(data);
        if (start == null) {
            start = node;
        } else
            travel(node);
    }

    void insert(int index, T data) {
        if (index != 0) {
            Node node = createNode(data);
            if (start == null)
                start = node;
            else
                travel(node, index);
        } else
            insertStart(data);

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

    void display() {
        Node cursor = start;
        while (cursor.next != null) {
            System.out.print(cursor.data + " -> ");
            cursor = cursor.next;
        }
        System.out.print(cursor.data);
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        // l.insert(34);
        // l.insert(45);
        // l.insert(55); // Inserts at last by default
        // l.insert(1, 65); // Inserts at any index in Linked List
        // l.insertAfter(50, 45);
        // l.insertBefore(40, 45);
        for (int i = 0; i < 10_000_000; i++) {
            l.insert(i);
        }
        // l.display();
    }
}