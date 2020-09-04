import com.cfam.bean.User;
import net.sf.cglib.beans.BeanMap;

import java.util.HashMap;

/**
 * CgLib方法测试
 * cglib 不支持remove  方法
 */
public class CglibTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("WWW");
        user.setAge(123);
        BeanMap beanMap = BeanMap.create(user);
        beanMap.remove("age");
        beanMap.forEach((k,v)->{
            System.out.println(k);
        } );
    }
}
