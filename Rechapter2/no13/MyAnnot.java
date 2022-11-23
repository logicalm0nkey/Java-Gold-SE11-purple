package Rechapter2.no13;

import java.lang.annotation.*;

// フィールド（メンバ変数）、メソッドでのみ使用可能なアノテーション
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface MyAnnot {
    
}
