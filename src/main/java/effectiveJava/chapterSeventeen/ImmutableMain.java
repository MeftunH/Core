package effectiveJava.chapterSeventeen;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class ImmutableMain
{
    public static void main(String[] args)
    {
        Immutable immutable=new Immutable(65);
        System.out.println(immutable);
        System.out.println(immutable);
        Mutable mutable=new Mutable();
        System.out.println(mutable.name);
    }
}
