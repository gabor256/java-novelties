package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesUpdates {

    //Java 11: String írása és olvasása lett egyszerűbb
    public static void main(String[] args) throws IOException {
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Java 11 is a cool thing.");
        System.out.println(path);
        String str = Files.readString(path);
        System.out.println(str);
    }
}
