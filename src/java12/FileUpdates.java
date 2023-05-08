package java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUpdates {
    public static void main(String[] args) throws IOException {
        // Arra való, hogy megmutassa honnantól nem egyformák a file-ok (melyik byte-tól)
        // Ha egyformák akkor a visszatérési értéke -1
        Path filePath1= Files.createTempFile("file1", ".txt");
        Path filePath2= Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1, "Java 12 újdonság");
        Files.writeString(filePath2, "Java 12 újdonság");

        long mistmatch = Files.mismatch(filePath1, filePath2);
        System.out.println(mistmatch); // -1

        Path filePath3= Files.createTempFile("file3", ".txt");
        Path filePath4= Files.createTempFile("file4", ".txt");
        Files.writeString(filePath3, "Java 12 eddig a régi");
        Files.writeString(filePath4, "Java 12 itt meg már új");

        mistmatch = Files.mismatch(filePath3, filePath4);
        System.out.println(mistmatch); // 8 - a 12 utáni space-ig egyformák


    }
}
