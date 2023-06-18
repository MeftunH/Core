package main.java.threading.FirstcreateOptions.createOptions;
//Java'da thread instance'i belirtmez isek java her zaman default bir thread olusturup ismini main koyar
public class ThreadExample {
    public static void main(String[] args) {
        //output:Thread Name : main
        System.out.println("Thread Name : " +   Thread.currentThread().getName());
    }
}