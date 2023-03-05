package effectiveJava.chapterSix;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import effectiveJava.chapterOne.itemThirteen.Data;

public class Immutable {
    public static void main(String[] args) {
        Data data=new Data("Maftun", 25);
        System.out.println(data);
        data.setValue(26);
        System.out.println(data);
    }
}
