package Serialization;
//* Serialization = converting an object into a byte stream so it can be saved to a file.

//* Deserialization = converting that byte stream back into an object.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    int id;
    String name;
    double grade;

    Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + "}";
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Path dataDir = Path.of("data");
        Path filePath = dataDir.resolve("student.ser");

        Student studentToSave = new Student(101, "Ivwananji", 89.5);

        try {
            if (!Files.exists(dataDir)) {
                Files.createDirectories(dataDir);
            }
        } catch (IOException e) {
            System.out.println("Could not create data directory: " + e.getMessage());
            return;
        }

        // 1) Serialize object to file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath.toFile()))) {
            out.writeObject(studentToSave);
            System.out.println("Serialized: " + studentToSave);
        } catch (IOException e) {
            System.out.println("Serialization failed: " + e.getMessage());
            return;
        }

        // 2) Deserialize object from file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath.toFile()))) {
            Student loadedStudent = (Student) in.readObject();
            System.out.println("Deserialized: " + loadedStudent);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization failed: " + e.getMessage());
        }
    }
}
