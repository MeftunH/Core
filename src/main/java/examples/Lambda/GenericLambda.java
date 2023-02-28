package examples.Lambda;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class GenericLambda {
    public static void main(String[] args) {
        IGeneric<String> s=()->{
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}
