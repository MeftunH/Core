package effectiveJava.chapterEightteen;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.HashSet;
import java.util.Set;

public class EditWithComposition {
    private static Set<String> set=new HashSet<>();

    public static void main(String[] args) {
        set.add("good");
        set.forEach(System.out::println);
    }
}
