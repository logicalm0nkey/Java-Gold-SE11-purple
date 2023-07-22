package chapter9.no7;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(100, "tanaka");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./chapter9/no7/data.txt"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./chapter9/no7/data.txt"))) {
            // Employee オブジェクトを Serialize
            oos.writeObject(employee);

            // Employee オブジェクトを Deserialize
            // readObject メソッドは戻り値が Object 型なのでキャストする必要がある
            Employee readEmployee = (Employee)ois.readObject();

            System.out.println(readEmployee.getId());
            System.out.println(readEmployee.getName());
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
