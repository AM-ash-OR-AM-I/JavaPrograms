import java.util.Scanner;

class Node {
    int info;
    Node link;

    Node(int info) {
        this.info = info;
    }
}

class LinkList{
    Node start, end;
    public void add(Node newNode){
        if (start==null)
            start = end = newNode;
        else {
            end.link = newNode;
            end = newNode;
        }
    }
    public void create(){
        System.out.print("Enter the info to add Node: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node newNode = new Node(data);
        add(newNode);
    }

    void search(int data){
        Node current = start;
        int index = 0;
        while (current!=null){
            if (current.info == data)
                System.out.printf("%s is found at index = %s, with object reference = %s\n",data, index, current);
            index++;
            current = current.link;
        }
    }

    int find2ndMax(){
        Node current = start;
        int max1=start.info, max2=Integer.MIN_VALUE;

        // Find maximum element
        while(current != null){
            max1 = Math.max(current.info, max1);
            current = current.link;
        }

        current = start;
        while(current != null){
            // If the info>max2 and info != max1 then update max2.
            if (current.info!=max1 && current.info>max2){
                max2 = current.info;
            }
            current = current.link;
        }
        return max2;
    }

    void removeDuplicate(){
        // Time complexity O(n^2) can be improved by hashSet.
        Node cursor1 = start, cursor2 = null, prev_cur2 = null;

        while (cursor1!=null){

            // Saves the previous reference
            prev_cur2 = cursor1;
            cursor2 = cursor1.link;

            while(cursor2 !=null){ // cursor2 iterates the loop checking if it matches with cursor1
                if (cursor2.info == cursor1.info){
                    if (cursor2.link==null){

                        // If it's the last node, remove current node.
                        prev_cur2.link = null;
                        end = prev_cur2;
                    }

                    // Removes the link of the node that is repeated.
                    else prev_cur2.link = cursor2.link;
                }
                prev_cur2 = cursor2;
                cursor2 = cursor2.link;
            }

            cursor1 = cursor1.link;
        }
        System.out.println("After duplicates are removed: ");
        display();
    }

    int length(){
        // Gets the length of linked list
        Node current = start;
        int count = 0;
        while (current != null) {
            current = current.link;
            count++;
        }
        return count;
    }

    int countUnique(){
        // Time complexity O(n^2) can be improved by hashSet.
        Node cursor1 = start, cursor2 = null;
        int originLength = length();
        int duplicates = 0;
        while (cursor1!=null){
            cursor2 = cursor1.link;
            while(cursor2 !=null){
                if (cursor2.info == cursor1.info){
                    duplicates ++; // Finds duplicate once duplicate is found breaks.
                    break;
                }
                cursor2 = cursor2.link;
            }
            cursor1 = cursor1.link;
        }
        return (originLength - duplicates);
    }

    public void display() {
        Node current = start;
        while (current.link != null) {
            System.out.print(current.info + " -> ");
            current = current.link;
        }
        System.out.print(current.info + "\n");
    }

}


public class MinorProject {
    static void showMenu(){
        // Using OpenJDK 18 for multi-line print statement.
        System.out.println(""" 
                |-- MENU --|
                1. Create
                2. Display
                3. Find 2nd Largest
                4. Search
                5. Remove Duplicates
                6. Count Unique
                Any other number to show menu again.
                """);
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        showMenu();
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            switch (choice) {
                case 1 : linkList.create();break;
                case 2 : linkList.display();break;
                case 3 : System.out.println("2nd Largest element is: "+linkList.find2ndMax());break;
                case 4 :
                    System.out.print("Enter info to search: ");
                    int element = sc.nextInt();
                    linkList.search(element);
                    break;
                case 5 : linkList.removeDuplicate();break;
                case 6 : System.out.println("No. of unique elements = "+linkList.countUnique());break;
                default: showMenu();
            }

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
        }
    }
}