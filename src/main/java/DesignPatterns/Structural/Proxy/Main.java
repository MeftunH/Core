package DesignPatterns.Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        //İstemcimiz process() yöntemini her çağırdığında, sadece işlemeyi görecek ve ilk yapılandırma her zaman gizli kalacaktır:
        object.process();
        object.process();
    }
}
