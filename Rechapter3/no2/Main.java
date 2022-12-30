package Rechapter3.no2;

public class Main {
    public static void main(String[] args) {
        String s = "hoge";
        int[] num = { 10, 0 };

        try {
            System.out.println(Integer.parseInt(s));
            System.out.println(num[0] / num[1]);
        } catch (NumberFormatException | ArithmeticException e) {
            // 例外は | で区切って複数個をインラインで書ける。
            // 例外クラスを複数個書いても、変数名は最後に1個だけ書く。
            e.printStackTrace();
        }
    }
}
