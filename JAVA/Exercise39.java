import java.lang.reflect.Method;

class Demo {

    public void greet() {

        System.out.println(
                "Hello Reflection"
        );
    }
}

public class Exercise39 {

    public static void main(String[] args)
            throws Exception {

        Class<?> cls =
                Class.forName("Demo");

        Method[] methods =
                cls.getDeclaredMethods();

        for (Method m : methods) {

            System.out.println(
                    m.getName()
            );
        }

        Object obj =
                cls.getDeclaredConstructor()
                        .newInstance();

        Method method =
                cls.getMethod("greet");

        method.invoke(obj);
    }
}