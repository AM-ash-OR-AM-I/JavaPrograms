package linkedList;

public interface LinkedListInterface<T> {
    void insertBeg(T data);
    void insertEnd(T data);
    void insertAny(int index, T data);
    void deleteBeg();
    void deleteEnd();
    void deleteAny(int index);
    void sort();
    void display(String message);
}
