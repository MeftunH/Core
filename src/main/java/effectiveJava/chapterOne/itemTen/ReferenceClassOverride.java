package effectiveJava.chapterOne.itemTen;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class ReferenceClassOverride {
    private final int a;
    private final int b;

    public ReferenceClassOverride(int a, int b) {
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {
        ReferenceClassOverride rfo1=new ReferenceClassOverride(10, 11);
        ReferenceClassOverride rfo2=new ReferenceClassOverride(10, 11);
        if (rfo1.equals(rfo2)) {
            System.out.println("equals"); //true
        } else {
            System.out.println("not equals"); //true
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this) {
            return true;
        }
        if (!(obj instanceof ReferenceClassOverride referenceClassOverride)) {
            return false;
        }

        return a==referenceClassOverride.a
                &&b==referenceClassOverride.b;
    }


}
