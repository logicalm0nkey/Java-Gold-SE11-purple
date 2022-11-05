package chapter1.ex.no5;

class User {
    public int id;
    public String firstName;
    public String lastName;

    @Override
    public int hashCode() {
        return id;
    }

    public boolean equals(User other) {
        return this.id == other.id;
    }
}

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();
        u1.id = 100;
        u2.id = 100;

        if (u1.equals(u2)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }
}
