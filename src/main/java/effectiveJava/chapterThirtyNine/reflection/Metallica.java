package effectiveJava.chapterThirtyNine.reflection;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class Metallica {
    public final static int PERSON_NUMBER=4;
    private String vocalName;
    private int vocalAge;

    public Metallica(String vocalName, int vocalAge) {
        this.vocalName=vocalName;
        this.vocalAge=vocalAge;
    }

    public Metallica() {
        this("James",59);
    }

    public String getVocalName() {
        return vocalName;
    }

    public static void printPersonNumber()
    {
        System.out.println("No: "+ PERSON_NUMBER);
    }
    public void setVocalName(String vocalName) {
        this.vocalName=vocalName;
    }
    public void increaseAge()
    {
        ++vocalAge;
    }
    public int getVocalAge() {
        return vocalAge;
    }

    public void setVocalAge(int vocalAge) {
        this.vocalAge=vocalAge;
    }
}
