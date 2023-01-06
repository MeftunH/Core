package OOP.Polymorphism;

public class Polymorphism {

}

class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println("Kullanıcı Adı : "+name);
    }
}

class PremiumUser extends User{
    private double price;

    public PremiumUser(String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Ödenen ücret : "+price);
    }
}

class NormalUser extends User{

    public NormalUser(String name) {
        super(name);
    }
}

 class Main {

    public static void showUserInfo(User user){
        user.showInfo();
    }

    public static void main(String[] args) {

        User user = new User("Kullanıcı");
        User user1 = new PremiumUser("Premium Kullanıcı",250);
        User user2 = new NormalUser("Normal Kullanıcı");

        System.out.println("--Kullanıcı Bilgileri--");
        showUserInfo(user);
        System.out.println("\n--Premium Kullanıcı Bilgileri--");
        showUserInfo(user1);
        System.out.println("\n--Normal Kullanıcı Bilgileri--");
        showUserInfo(user2);
    }
}