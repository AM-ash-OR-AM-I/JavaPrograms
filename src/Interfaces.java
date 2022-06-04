import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

class Resolution {
    private int height, width;

    Resolution(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
    
}

interface interfaceDesign {
    String variable = "Hi there";

    abstract void setResolution(int height, int width);

}


public class Interfaces implements interfaceDesign{
    Resolution res;
    public void displayResolution() {
        System.out.printf("Height = %d, width = %d", res.getHeight(), res.getWidth());
    }

    public void setResolution(int height, int width) {
        res = new Resolution(height, width);

    }
    
    static <T> void printList(T[] list) {
        // System.out.println(list);
        for (T x : list)
            System.out.println(x);
    }

    public static void main() {
        System.out.println("HI there");
    }

    public static void main(String[] args) {
        Integer i = 6;
        Resolution res = new Resolution(100, 200);
        Generic<Resolution, String> g = new Generic<Resolution, String>();
        

        // String[] s = { "ITER", "SOA", "CSE" };
        // Integer[] s1 = {1, 2, 3};
        // printList(lst1);
        
        // Interfaces interfaceTest = new Interfaces();
        // interfaceTest.setResolution(1920, 1080);
        // interfaceTest.displayResolution();
    }
}
