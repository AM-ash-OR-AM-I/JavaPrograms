import java.util.ArrayList;
import java.util.List;

class NewTest {
    public static void main(String[] args) {
        System.out.println("hi");
    }
}

class ArrayTest {

    static <T> void remove(ArrayList<T> arr) {
        T element = arr.get(0);
        arr.remove(element);
        System.out.println(arr);
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(
                List.of(
                        "Hello",
                        "Hi",
                        "How are you"));
        ArrayTest.<String>remove(arrayList);
        System.out.println("Hi");

    }
}
