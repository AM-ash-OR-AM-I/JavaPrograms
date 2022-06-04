
public class EnumTest{
    enum CONST {CONST1, CONST2, CONST3}
    public static void main(String[] args) {
        for (CONST m: CONST.values())
        System.out.println(m);
    }
}