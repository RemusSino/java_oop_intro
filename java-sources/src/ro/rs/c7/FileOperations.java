package ro.rs.c7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author Remus Sinorchian; created on 4/18/2017
 */
public class FileOperations {
    public static void main(String[] args) throws IOException {
        Files.write(Paths.get("D:\\test.txt"), "acesta e un test".getBytes(), StandardOpenOption
                .CREATE_NEW);

        System.out.println(new String(Files.readAllBytes(Paths.get("D:/test.txt"))));
    }
}
