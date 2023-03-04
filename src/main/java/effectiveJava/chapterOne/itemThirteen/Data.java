package effectiveJava.chapterOne.itemThirteen;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class Data {
    private String name;
    private int value;

    public Data(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}