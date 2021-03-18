import java.util.Random;

public class EnumTest {
    public static void main(String[] args) {
       /* String code = APFile.getCode("businessApply", "身份证正面");
        System.out.println(code);
        List<String> businessApply = APFile.getFile("businessApply");
        System.out.println(businessApply);*/
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
