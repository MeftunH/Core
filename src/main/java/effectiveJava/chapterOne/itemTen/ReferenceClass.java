package effectiveJava.chapterOne.itemTen;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class ReferenceClass {
    private int a,b;
    public ReferenceClass(int a, int b) {
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {
        //reference types compare  on stack
        System.out.println(10==20);
        System.out.println('a'=='b');
        System.out.println('a'==97);
        System.out.println(true==true);

        //object type compare on heap
        ReferenceClass r1=new ReferenceClass(1,2);
        ReferenceClass r2=new ReferenceClass(1,2);
        System.out.println(r1==r2);//false
        System.out.println(r1.equals(r2)); //false

    }
}
