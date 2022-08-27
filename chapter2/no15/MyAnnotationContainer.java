package chapter2.no15;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotationContainer {
    public MyAnnotation[] value();    
}
