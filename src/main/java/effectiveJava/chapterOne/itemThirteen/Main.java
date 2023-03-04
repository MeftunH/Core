package effectiveJava.chapterOne.itemThirteen;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Shallow Copy
        Stack st = new Stack();
        Stack st1=st;
        System.out.println(st1==st);

        //Deep Copy
        Stack st2 = new Stack();
        Stack st3 = (Stack) st2.clone();
        System.out.println(st2==st3);
    }
}
