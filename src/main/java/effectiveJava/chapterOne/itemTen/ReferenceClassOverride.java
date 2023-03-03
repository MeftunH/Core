package effectiveJava.chapterOne.itemTen;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.HashMap;
import java.util.Map;

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
        //this get us null.
        Map<ReferenceClassOverride,String> m=new HashMap<>();
        m.put(new ReferenceClassOverride(1,2),"FistElement");
        System.out.println(m.get(new ReferenceClassOverride(1,2)));
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

    @Override
    public int hashCode() {
        int result =Integer.hashCode(b);
        //random const value * result
        result = 31*result+Integer.hashCode(a);
        return result;
    }
}
