package effectiveJava.chapterThirtyNine.annotation;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import effectiveJava.chapterThirtyNine.annotation.LogLevel;
import effectiveJava.chapterThirtyNine.annotation.Loggable;

public class Class {
    @Loggable(level = LogLevel.WARNING, prefix = "MyClass")
    public void myMethod() {
        // ...
    }
}
