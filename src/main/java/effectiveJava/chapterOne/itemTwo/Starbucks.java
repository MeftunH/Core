package effectiveJava.chapterOne.itemTwo;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class Starbucks
{
    //required
    private String size;
    //non required
    private String nonLactose;
    private String nonSugar;

    public Starbucks() {
    }

    public void setSize(String size) {
        this.size=size;
    }

    public void setNonLactose(String nonLactose) {
        this.nonLactose=nonLactose;
    }

    public void setNonSugar(String nonSugar) {
        this.nonSugar=nonSugar;
    }
}
