package chapter2.no14;


// @Inherited を確認するクラス
public class Main {
    static String getVal(MyAnnotation annotation) {
        if (annotation == null) {
            return "null";
        }

        // MyAnnotation の value() は public String value() というメソッドだから使える。
        return annotation.value();
    }

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Class[] array = { ChildA.class, ChildB.class, ChildC.class };

        for (Class<?> cls : array) {
            // クラス名の表示
            System.out.println("[" + cls.getSimpleName() + "]");
            // クラスのアノテーションを取得して、value()を表示
            System.out.println(getVal(cls.getAnnotation(MyAnnotation.class)));
            // クラスのフィールドのアノテーションを取得して、value()を表示
            System.out.println(getVal(cls.getDeclaredField("field").getAnnotation(MyAnnotation.class)));
            // クラスのメソッドのアノテーションを取得して、value()を表示
            System.out.println(getVal(cls.getDeclaredMethod("method").getAnnotation(MyAnnotation.class)));
            System.out.println();
        }
    }

}
