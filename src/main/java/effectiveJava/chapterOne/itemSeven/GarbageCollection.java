package effectiveJava.chapterOne.itemSeven;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class GarbageCollection {
    public void finalize()
    {
        System.out.println("Garbage cleaned");
    }
    public static void main(String[] args) {
        GarbageCollection john=new GarbageCollection();
        GarbageCollection jane=new GarbageCollection();
        GarbageCollection mane=new GarbageCollection();

        john=null;
        jane=mane;

        System.gc();
    }
}
