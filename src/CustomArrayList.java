import java.util.ArrayList;

class CustomArray<T> extends ArrayList<T> {
    void print() {
        System.out.println("Custom method");
    }
}
public class CustomArrayList {
    public static void main(String[] args) {
        CustomArray<Integer> customArray = new CustomArray<>();
        customArray.add(34);
        customArray.print();
    }
}
