package Rechapter4.no22;

import java.util.*;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
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

// Employee 型を比較するためのクラス
class MyRule implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        // id を比較する
        // 第1引数の id の方が大きかったら Employee として順序が大きいとみなす
        return e1.getId().compareTo(e2.getId());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("taro", 20);
        Employee e2 = new Employee("takayuki", 10);
        // 名前順だとこれが最大
        Employee e3 = new Employee("hiromi", 50);

        ArrayList<Employee> array = new ArrayList<>();
        array.add(e1);
        array.add(e2);
        array.add(e3);

        System.out.println("ArrayList のインデックス順で表示");
        print(array);

        System.out.println("MyRule の順序（id 昇順）で表示");
        // Collections.sort に List<T> と Comparator<T> を渡すと、
        // List の中身を Comparator の順序で並び替えてくれる
        Collections.sort(array, new MyRule());
        print(array);

        System.out.println("名前の文字数昇順で表示");
        Collections.sort(array, new Comparator<Employee>() {
            // 匿名クラス
            public int compare(Employee e1, Employee e2) {
                return e1.getName().length() - e2.getName().length();
            }
        });
        print(array);
    }

    static void print(ArrayList<Employee> array) {
        for (Employee emp : array) {
            System.out.println(emp.getId() + " " + emp.getName());
        }
    }
}
