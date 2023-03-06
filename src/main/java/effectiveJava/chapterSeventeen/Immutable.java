package effectiveJava.chapterSeventeen;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import effectiveJava.chapterOne.itemThirteen.Data;

public final class Immutable {
    private final int value;

    public Immutable(int value) {
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Data data=new Data("Maftun", 25);
        System.out.println(data);
        data.setValue(26);
        System.out.println(data);
    }
}
