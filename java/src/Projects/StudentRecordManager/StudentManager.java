package Projects.StudentRecordManager;
//* Projects = mini console applications for practice.
//* This file is a runnable practice example for learning.


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentManager {
    private final Map<Integer, Student> students = new HashMap<>();
    private final Path filePath;

    public StudentManager(String fileName) {
        this.filePath = Paths.get(fileName);
    }

    public boolean addStudent(Student student) {
        if (students.containsKey(student.getId())) {
            return false;
        }
        students.put(student.getId(), student);
        return true;
    }

    public boolean updateStudent(int id, String name, String course, double grade) {
        Student student = students.get(id);
        if (student == null) {
            return false;
        }
        student.setName(name);
        student.setCourse(course);
        student.setGrade(grade);
        return true;
    }

    public boolean removeStudent(int id) {
        return students.remove(id) != null;
    }

    public Optional<Student> findStudentById(int id) {
        return Optional.ofNullable(students.get(id));
    }

    public List<Student> listStudentsSortedByGradeDesc() {
        return students.values()
                .stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .collect(Collectors.toList());
    }

    public List<Student> filterByCourse(String course) {
        return students.values()
                .stream()
                .filter(student -> student.getCourse().equalsIgnoreCase(course))
                .collect(Collectors.toList());
    }

    public double averageGrade() {
        return students.values().stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public int totalStudents() {
        return students.size();
    }

    public void saveToFile() throws IOException {
        Path parent = filePath.getParent();
        if (parent != null && Files.notExists(parent)) {
            Files.createDirectories(parent);
        }

        try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
            for (Student student : students.values()) {
                writer.write(student.getId() + "," + student.getName() + "," + student.getCourse() + ","
                        + student.getGrade());
                writer.newLine();
            }
        }
    }

    public void loadFromFile() throws IOException {
        if (Files.notExists(filePath)) {
            return;
        }

        List<String> lines = Files.readAllLines(filePath);
        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts.length != 4) {
                continue;
            }

            int id = Integer.parseInt(parts[0].trim());
            String name = parts[1].trim();
            String course = parts[2].trim();
            double grade = Double.parseDouble(parts[3].trim());

            students.put(id, new Student(id, name, course, grade));
        }
    }

    public List<Student> listAllStudents() {
        return new ArrayList<>(students.values());
    }
}
