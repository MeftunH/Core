package main.java.effectiveJava.chapterOne.itemOne;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class FootballTeam {
    private String newFootballer;
    private int age;

    public FootballTeam(String newFootballer, int age) {
        this.newFootballer=newFootballer;
        this.age=age;
    }
    public static FootballTeam createNewFootballer(String newFootballer)
    {
        return new FootballTeam(newFootballer,22);
    }
}
