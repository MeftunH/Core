package effectiveJava.chapterOne.itemThirteen;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class Table implements Cloneable {
    private Data[] data;

    public Table(Data[] data) {
        this.data = data;
    }

    public Data[] getData() {
        return data;
    }

    public void setData(Data[] data) {
        this.data = data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Deep Copy
        Data[] clonedData = new Data[data.length];
        for (int i = 0; i < data.length; i++) {
            clonedData[i] = new Data(data[i].getName(), data[i].getValue());
        }
        return new Table(clonedData);
    }
}
