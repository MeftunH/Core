package SOLID.DependencyInversion;

public class Email implements Message {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
