package effectiveJava.chapterSix;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class Main {

    private static long sum() {
        Long sum=0L;
        for (long i=0; i<=1500; i++) {
            sum+=i;
        }
        return sum;
    }
    private static long sumPrimitive() {
        long sum=0L;
        for (long i=0; i<=1500; i++) {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        String word=new String("Maftun");
        String word2="Maftun";
        System.out.println(word==word2);

        //613001
        long start=System.nanoTime();
        sum();
        long end=System.nanoTime();
        long total=end-start;
        System.out.println("wrapper: "+total);

        //240300
        long startPrimitive=System.nanoTime();
        sum();
        long endPrimitive=System.nanoTime();
        long totalPrimitive=endPrimitive-startPrimitive;
        System.out.println("primitive: "+totalPrimitive);
    }
}
