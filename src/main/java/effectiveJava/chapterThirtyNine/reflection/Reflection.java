package effectiveJava.chapterThirtyNine.reflection;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.lang.reflect.Constructor;

public class Reflection {
    public static void main(String[] args) {
        try
        {
            Class<?> classReflection = Class.forName("effectiveJava.chapterOne.itemThirteen.reflection.Metallica");
            Constructor<?> constructor = classReflection.getDeclaredConstructor(String.class, Integer.TYPE);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Reflection is done");
        System.out.println("ModifiersL: "+Metallica.class.getModifiers());
        System.out.println("Name: "+Metallica.class.getName());
        System.out.println("Package: "+Metallica.class.getPackage());
    }
}
