import org.reflections.Reflections;

public class ListClasses {
    public static void main(String[] args) {
        Reflections reflections = new Reflections("java.util");  // change package name
        Set<Class<?>> classes = reflections.getSubTypesOf(Object.class);
        for (Class<?> cls : classes) {
            System.out.println(cls.getName());
        }
    }
}
