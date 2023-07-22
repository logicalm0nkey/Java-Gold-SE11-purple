package chapter9.no26;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./chapter9/no26/data.txt");

        DosFileAttributes attributes = Files.readAttributes(path, DosFileAttributes.class);

        System.out.format("isArchive: %s%n", attributes.isArchive());
        // 隠しファイルか否か
        System.out.format("isHidden: %s%n", attributes.isHidden());
        // 読み取り専用か否か
        System.out.format("isReadOnly: %s%n", attributes.isReadOnly());
        // OS の組み込みファイル？か否か
        System.out.format("isSystem: %s%n", attributes.isSystem());
    }
}
