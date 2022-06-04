import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraphTheory {
    static int getSum(ArrayList<Integer> sequence){
        int sum = 0;
        for (int i = 0; i < sequence.size(); i++) {
            sum += sequence.get(i);
        }
        return sum;
    }
    static boolean isGraphicSequence(ArrayList<Integer> sequence) {
        
        int sum = getSum(sequence);
        if ((sum & 1) == 1) {
            return false;
        }
        Collections.sort(sequence); // Sort the array.
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(
                List.of(5, 5, 4, 3, 2, 2, 2, 1));
        isGraphicSequence(arr);
    }
}
