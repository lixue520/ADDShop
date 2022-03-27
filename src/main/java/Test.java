import java.lang.reflect.Method;
import org.apache.commons.lang3.reflect.MethodUtils;

/**
 * @Author qin
 * @Data 20:52
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        TestShop t=new TestShop();
        Class c = Class.forName("TestShop");
        Method methods[] = MethodUtils.getMethodsWithAnnotation(c,TM.class);
        System.out.println(methods.length);
    }

}
