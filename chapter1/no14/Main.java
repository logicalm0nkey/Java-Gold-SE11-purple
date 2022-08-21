package chapter1.no14;

public interface Main {
    // interface では Object クラスのメソッドはオーバーライドできない

    @Override
    default boolean equals(Object obj) {
        return true;
    };

    default int hashCode() {
        return 0;
    }

    @Override
    default String toString() {
        return "hello";
    };
}
