import java.util.*;
public class CurrencyTest {
    public static void main(String[] args) {
        var c = Currency.getAvailableCurrencies();
        Currency c1 = Currency.getInstance("");
        System.out.println(c);

    }
}
