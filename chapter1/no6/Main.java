package chapter1.no6;

enum Card {
    SPADES(3),  // こんな感じに書くと、引数ありのコンストラクタが呼ばれる
    CLUBS(1),
    DIAMONDS(4),   // この辺の、列挙子を宣言している途中で ; を書くとコンパイルエラーとなる
    HEARTS();     // 列挙子の宣言を終了するときだけ ; を書く

    // ; を書いた後に、普通のクラス定義っぽいアレコレを定義できる
    private int a;

    Card() {
        this.a = 100;
    }

    Card(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }
}

public class Main {
    public static void main(String[] args) {
        Card card = Card.SPADES;
        // System.out.println() で card.toString() が呼ばれるので、これで列挙子の名前が出力される
        System.out.println(card);
        // 列挙型のインスタンスメソッドも呼べる
        // 列挙子の実態が列挙型のインスタンスなのでインスタンスメソッドが呼べるってわけ
        System.out.println(card.getA());
        System.out.println(Card.HEARTS.getA());

        for (Card card2 : Card.values()) {
            // 列挙子は宣言した順番で values() メソッドの戻り値の配列に格納される
            System.out.print(card2 + " ");
        }
    }
}
