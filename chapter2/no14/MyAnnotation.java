package chapter2.no14;

import java.lang.annotation.*;

// @Inherited の挙動を確かめる
@Inherited
// クラスのアノテーションだけ継承されることを確かめるため、あえてメソッドやフィールドもターゲットにする
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
// 確認用のメソッドを実行してアノテーションを確認したいので、 RUNTIME を指定する
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
}
