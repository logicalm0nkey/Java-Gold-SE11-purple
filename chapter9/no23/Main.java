package chapter9.no23;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./chapter9/no23/data.txt");

        List<String> list = Files.readAllLines(path);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
