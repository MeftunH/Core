package examples.Static;

public class StaticNestedClass {
    static int data=30;
    static class Inner{
        static void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        StaticNestedClass.Inner.msg();//no need to create the instance of static nested class
    }
}
