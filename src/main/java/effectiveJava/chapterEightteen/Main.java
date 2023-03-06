package effectiveJava.chapterEightteen;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class Main {
    public static void main(String[] args) {
        //we can access all method from another class.It's bad.We broke encapsulation
        BadInheritance bi=new BadInheritance();

        EditWithComposition ewc=new EditWithComposition();
    }
}
