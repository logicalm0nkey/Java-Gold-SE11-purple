package chapter9.no24;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./chapter9/no24/data.txt");

        Object obj1 = Files.getAttribute(path, "creationTime");
        Object obj2 = Files.getAttribute(path, "lastModifiedTime");
        Object obj3 = Files.getAttribute(path, "size");

        System.out.println("creationTime: " + obj1);
        System.out.println("lastModifiedTime: " + obj2);
        // 単位は byte
        System.out.println("size: " + obj3);
    }
}
