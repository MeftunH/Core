package effectiveJava.chapterSix;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class RegExample {
    private static final String REGEX = "^[a-zA-Z0-9_]*$";
    private static final String INPUT = "abcde12345_";
    private static boolean isRomanNumeral(String s) {
        return s.matches(REGEX);
    }
    public static void main(String[] args) {
        System.out.println(isRomanNumeral(INPUT));
    }
}
