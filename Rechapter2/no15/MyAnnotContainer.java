package Rechapter2.no15;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotContainer {
    MyAnnot[] value();
}
