package Rechapter2.no14;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnot {
    String value();
}
