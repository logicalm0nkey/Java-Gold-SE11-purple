package chapter1.no5;

public class Main {
    public static void main(String[] args) {
        Card card = Card.SPADE;

        switch (card) {
            case SPADE:
            case CLUBS:
                System.out.println("black");
                break;
            case HEARTS:
            case DIAMONDS:
                System.out.println("red");
                break;
        }

        System.out.println("enum.name() is " + card.name());
        System.out.println("enum.toString() is " + card.toString());
        System.out.println("enum.ordinal() is " + Card.DIAMONDS.ordinal());
    }
}
