package chapter9.no25;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./chapter9/no25/data.txt");

        BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.format("creationTime: %s%n", attributes.creationTime());
        System.out.format("lastModifiedTime: %s%n", attributes.lastModifiedTime());
        System.out.format("size: %s%n", attributes.size());
    }
}
