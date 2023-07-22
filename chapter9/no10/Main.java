package chapter9.no10;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        PrintWriter writer = console.writer();

        while (true) {
            String str = console.readLine();

            if (str.equals("")) {
                break;
            }

            // writer.append(" 入力されたデータ: " + str + "\n");
            writer.write(" 入力されたデータ: " + str + "\n");
            writer.flush();
        }
    }
}
