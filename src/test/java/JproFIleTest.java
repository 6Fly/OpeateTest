import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class JproFIleTest {
    public static void main(String[] args) {
        /*HashMap<Object, Object> ma = new HashMap<>();
        for (int i = 0; i < 100000000; i++) {
           ma.put(i,i);
        }*/
        String aa = null;
        BigDecimal bigDecimal = new BigDecimal(aa);
        System.out.println(bigDecimal.doubleValue());
    }
}
