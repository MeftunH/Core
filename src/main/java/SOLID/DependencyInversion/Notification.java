package SOLID.DependencyInversion;

public class Notification {
    private Message message;

    public Notification(Message message) {
        this.message = message;
    }

    public void notify(String message) {
        this.message.sendMessage(message);
    }
}
