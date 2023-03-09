package effectiveJava.chapterThirtyNine.annotation;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Loggable {
    LogLevel level() default LogLevel.INFO;
    String prefix() default "";
}

enum LogLevel {
    INFO, WARNING, ERROR;
}
