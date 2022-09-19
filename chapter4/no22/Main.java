package chapter4.no22;

import java.util.*;

class Employee {
    private String name;
    private Integer id;

    public Employee(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// Employee クラス用の Comparator 実装クラス。
class MyRule implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        // Integer クラスが Comparable.compareTo を実装しているので、それを使う。
        return e1.getId().compareTo(e2.getId());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(2, "taro");
        Employee e2 = new Employee(1, "takayuki");
        Employee e3 = new Employee(5, "hiromi");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println("ArrayList のインデックス順で表示");
        print(employees);

        System.out.println("MyRule で定義した順序(id 昇順)で表示");
        // Comparator を使ってリストをソートするときは Collections.sort() を使う
        // ソートは破壊的操作として実行される。つまり、リストそのものの状態が変わる（新しいリストが作られるということではない）。
        Collections.sort(employees, new MyRule());
        // Collections.sort で employees の並び順が変わったので、それをそのまま表示すればOK
        print(employees);

        System.out.println("Employee の名前昇順で表示");
        // 匿名クラスを使って、その場で Comparator を実装。
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
        print(employees);
    }

    static void print(ArrayList<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e.getId() + " " + e.getName());
        }
        System.out.println();
    }
}
