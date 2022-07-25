package CustomAnnotations;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

class ClassDemo {

    @CustomAnnotation(value = 10)
    public void sayHello() {
        System.out.println("Hello!");
    }
}
public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        ClassDemo classDemo = new ClassDemo();
        Method methodValue = classDemo.getClass().getMethod("sayHello");  // this is calling a method by reflection API -> (use to fetch methodName or method type).
        CustomAnnotation customAnnotation = methodValue.getAnnotation(CustomAnnotation.class);
        System.out.println("Value of CustomAnnotation: "+ customAnnotation.value());
    }
}
