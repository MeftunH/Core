package examples.String;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        String result = sb.toString();
    }
}
