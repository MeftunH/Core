package effectiveJava.chapterFour;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class Main {
    public static void main(String[] args) {
        AccessModifier am=new AccessModifier();
        //we can't access private method from another class
        //        am.message();
        System.out.println(am.publicMessage());
    }
}
