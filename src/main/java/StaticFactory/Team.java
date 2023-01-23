package StaticFactory;

public class Team {
    private String name;
    private int age;

    public Team(String name, int age) {
        //Todo: Auto-generate constructor stub
        this.name = name;
        this.age = age;
    }

    public static Team team(String newPlayer) {
        return new Team(newPlayer, 22);
    }
}
