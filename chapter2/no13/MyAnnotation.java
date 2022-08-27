package chapter2.no13;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// 適用個所としてフィールドとメソッドを指定。これ以外の場所で使うとコンパイルエラーとなる。
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface MyAnnotation {
    
}
