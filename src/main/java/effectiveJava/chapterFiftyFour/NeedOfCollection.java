package effectiveJava.chapterFiftyFour;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class NeedOfCollection {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        int e=30;
        int f=30;
        int g=30;
        int h=30;

        int[] arr=new int[10000];

        //limitation of array
        //1. ARRAYS ARE FIXED IN SIZE
        //2. ARRAYS ARE NOT TYPE SAFE
        //3. ARRAYS CAN HOLD ONLY HOMEGENEOUS DATA ELEMENTS
        //4. ARRAYS ARE NOT GENERIC
        Student[] students=new Student[10];
        students[0]=new Student();
        students[1]=new Student();
        //compile time error
//        students[2] = new Book();

        Object[] objects=new Object[10];
        objects[0]=new Student();
        objects[1]=new Book();
    }
}

class Book {

}

class Student {

}