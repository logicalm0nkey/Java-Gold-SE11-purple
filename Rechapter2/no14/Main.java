package Rechapter2.no14;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Class[] ary = { ChildA.class, ChildB.class, ChildC.class };

        for (Class<?> class1 : ary) {
            // クラス名の表示
            System.out.println("【" + class1.getSimpleName() + "】");
            // 型に付与されたアノテーションを取得して、その内容を表示する
            System.out.println(getValue(class1.getAnnotation(MyAnnot.class)));
            // フィールド s に付与されたアノテーションを取得して、その内容を表示する
            System.out.println(getValue(
                    class1.getDeclaredField("s").getAnnotation(MyAnnot.class)));
            // メソッド method() に付与されたアノテーションを取得して、その内容を表示する
            System.out.println(getValue(
                    class1.getDeclaredMethod("method").getAnnotation(MyAnnot.class)));

            System.out.println();
        }
    }

    static String getValue(MyAnnot annot) {
        return annot == null ? "null" : annot.value();
    }
}
