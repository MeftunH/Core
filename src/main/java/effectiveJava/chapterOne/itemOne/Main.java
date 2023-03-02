package effectiveJava.chapterOne.itemOne;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class Main {
    public static void main(String[] args) {
        Food food =  Food.hotFood("name");
        //we want to have our all footballers age 22
        // FootballTeam footballTeam=new FootballTeam("Maftun",22);
        FootballTeam footballTeam1=FootballTeam.createNewFootballer("Ronaldo");
        FootballTeam footballTeam2=FootballTeam.createNewFootballer("Messi");
    }
}
