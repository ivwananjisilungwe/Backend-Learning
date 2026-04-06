package FileIO_NIO;
//* FileIO_NIO = file handling using java.io and java.nio APIs.
//* This file is a runnable practice example for learning.


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileIONIOExample {

    public static void main(String[] args) {
        Path dirPath = Paths.get("data");
        Path filePath = dirPath.resolve("notes.txt");

        try {
            // 1) Create directory and file if they don't exist
            if (!Files.exists(dirPath)) {
                Files.createDirectories(dirPath);
            }
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
            }

            // 2) Write text (overwrite)
            try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
                writer.write("Java File I/O and NIO Example\n");
                writer.write("Line 2: Learning how to read and write files.\n");
            }

            // 3) Append one more line
            Files.write(
                    filePath,
                    List.of("Line 3: Appended using Files.write with NIO."),
                    StandardOpenOption.APPEND);

            // 4) Read and print all lines
            System.out.println("File contents:");
            try (BufferedReader reader = Files.newBufferedReader(filePath)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

            // 5) File metadata checks
            System.out.println("\nPath: " + filePath.toAbsolutePath());
            System.out.println("Exists: " + Files.exists(filePath));
            System.out.println("Size (bytes): " + Files.size(filePath));

        } catch (IOException e) {
            System.out.println("File operation failed: " + e.getMessage());
        }
    }
}
