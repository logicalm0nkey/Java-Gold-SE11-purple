package chapter2.no15;

import java.lang.annotation.*;

// @Repeatable を適用すると、このアノテーションは、1ヶ所に複数回適用可能となる。
@Repeatable(MyAnnotationContainer.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
}
