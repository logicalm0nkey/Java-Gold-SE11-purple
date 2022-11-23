package Rechapter2.no15;

import java.lang.annotation.*;

@Repeatable(MyAnnotContainer.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnot {
    String value();
}
