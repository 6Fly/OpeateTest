import com.cfam.enums.APFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnumTest {
    public static void main(String[] args) {
       /* String code = APFile.getCode("businessApply", "身份证正面");
        System.out.println(code);
        List<String> businessApply = APFile.getFile("businessApply");
        System.out.println(businessApply);*/
        /*String str = "https://carcredit-ample.oss-cn-beijing.aliyuncs.com/BQAP%28AH%29TJ202011190003.pdf";
        String s = str.split("\\?Expires")[0];
        System.out.println(s);*/
        /*List list = new ArrayList<>();
        list.add(11);
        list.add(22);

        List list1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list1.addAll(list);
        }
        System.out.println(list1);*/

        Random random = new Random();
        int ends = random.nextInt(99);
        String format = String.format("%02d", ends);
        System.out.println(format);

    }
}
