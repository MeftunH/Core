package SOLID.DependencyInversion;

public class SMS implements Message {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
