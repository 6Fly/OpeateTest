import java.util.HashMap;

public class JproFIleTest {
    public static void main(String[] args) {
        HashMap<Object, Object> ma = new HashMap<>();
        for (int i = 0; i < 100000000; i++) {
           ma.put(i,i);
        }
    }
}
