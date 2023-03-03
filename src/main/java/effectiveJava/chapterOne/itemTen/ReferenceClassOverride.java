package effectiveJava.chapterOne.itemTen;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class ReferenceClassOverride {
    private int a, b;

    public ReferenceClassOverride(int a, int b) {
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {

    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this) {
            return true;
        }
        if (!(obj instanceof ReferenceClassOverride)) {
            return false;
        }
        ReferenceClassOverride referenceClassOverride=(ReferenceClassOverride) obj;

        return Integer.compare(a, referenceClassOverride.a)==0
                &&Integer.compare(b, referenceClassOverride.b)==0;
    }

    ReferenceClassOverride rfo1=new ReferenceClassOverride(10, 11);
    ReferenceClassOverride rfo2=new ReferenceClassOverride(10, 11);
//    if(rfo1.equals(rfo2)){
//        System.out.println("equals"); //true
//    } else{
//        System.out.println("not equals"); //true
//    }
}
