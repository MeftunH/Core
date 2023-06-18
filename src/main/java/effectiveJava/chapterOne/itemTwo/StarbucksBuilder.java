package main.java.effectiveJava.chapterOne.itemTwo;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class StarbucksBuilder {
    //Required
    private String size;

    private String nonLactose;
    private String sugar;

    public static class Builder{
        private final String size;

        private String nonLactose;
        private String sugar;

        public Builder(String size)
        {
            super();
            this.size=size;
        }
        public Builder nonLactose(String nonLactose)
        {
            this.nonLactose=nonLactose;
            return this;
        }
        public Builder sugar(String sugar)
        {
            sugar=sugar;
            return this;
        }
        public StarbucksBuilder build()
        {
            return new StarbucksBuilder(this);
        }
    }
    public StarbucksBuilder(Builder builder) {
        size=builder.size;
        nonLactose=builder.nonLactose;
        sugar=builder.nonLactose;
    }
}
