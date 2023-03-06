package effectiveJava.chapterEightteen;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.HashSet;

public class BadInheritance extends HashSet<Object> {
    // Broken - Inappropriate use of inheritance!
    public static void main(String[] args) {
        BadInheritance bad = new BadInheritance();
        bad.add("bad");
       bad.forEach(System.out::println);
    }
}
