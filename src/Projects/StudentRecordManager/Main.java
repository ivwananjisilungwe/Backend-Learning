package Projects.StudentRecordManager;
//* Projects = mini console applications for practice.
//* This file is a runnable practice example for learning.


import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentManager manager = new StudentManager("data/students.csv");

        try {
            manager.loadFromFile();
            System.out.println("Student data loaded successfully.");
        } catch (IOException e) {
            System.out.println("Could not load existing data: " + e.getMessage());
        }

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Choose an option: ");

            switch (choice) {
                case 1 -> addStudent(manager);
                case 2 -> updateStudent(manager);
                case 3 -> removeStudent(manager);
                case 4 -> findStudent(manager);
                case 5 -> listAllStudents(manager);
                case 6 -> listTopPerformers(manager);
                case 7 -> filterByCourse(manager);
                case 8 -> showStatistics(manager);
                case 9 -> saveData(manager);
                case 0 -> {
                    saveData(manager);
                    System.out.println("Exiting Student Record Manager. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== Student Record Manager =====");
        System.out.println("1. Add student");
        System.out.println("2. Update student");
        System.out.println("3. Remove student");
        System.out.println("4. Find student by ID");
        System.out.println("5. List all students");
        System.out.println("6. List students sorted by grade (high to low)");
        System.out.println("7. Filter students by course");
        System.out.println("8. Show statistics");
        System.out.println("9. Save data");
        System.out.println("0. Exit");
    }

    private static void addStudent(StudentManager manager) {
        int id = readInt("Enter student ID: ");
        String name = readNonEmptyString("Enter student name: ");
        String course = readNonEmptyString("Enter course: ");
        double grade = readGrade("Enter grade (0-100): ");

        boolean added = manager.addStudent(new Student(id, name, course, grade));
        if (added) {
            System.out.println("Student added successfully.");
        } else {
            System.out.println("A student with that ID already exists.");
        }
    }

    private static void updateStudent(StudentManager manager) {
        int id = readInt("Enter ID of student to update: ");
        String name = readNonEmptyString("Enter new name: ");
        String course = readNonEmptyString("Enter new course: ");
        double grade = readGrade("Enter new grade (0-100): ");

        boolean updated = manager.updateStudent(id, name, course, grade);
        if (updated) {
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void removeStudent(StudentManager manager) {
        int id = readInt("Enter ID of student to remove: ");
        boolean removed = manager.removeStudent(id);

        if (removed) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void findStudent(StudentManager manager) {
        int id = readInt("Enter student ID to search: ");
        Optional<Student> student = manager.findStudentById(id);
        if (student.isPresent()) {
            System.out.println(student.get());
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void listAllStudents(StudentManager manager) {
        List<Student> students = manager.listAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        students.forEach(System.out::println);
    }

    private static void listTopPerformers(StudentManager manager) {
        List<Student> sorted = manager.listStudentsSortedByGradeDesc();
        if (sorted.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        sorted.forEach(System.out::println);
    }

    private static void filterByCourse(StudentManager manager) {
        String course = readNonEmptyString("Enter course to filter: ");
        List<Student> filtered = manager.filterByCourse(course);
        if (filtered.isEmpty()) {
            System.out.println("No students found for course: " + course);
            return;
        }
        filtered.forEach(System.out::println);
    }

    private static void showStatistics(StudentManager manager) {
        System.out.println("Total students: " + manager.totalStudents());
        System.out.printf("Average grade: %.2f%n", manager.averageGrade());
    }

    private static void saveData(StudentManager manager) {
        try {
            manager.saveToFile();
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Failed to save data: " + e.getMessage());
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    private static double readGrade(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                double grade = Double.parseDouble(input);
                if (grade >= 0 && grade <= 100) {
                    return grade;
                }
                System.out.println("Grade must be between 0 and 100.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    private static String readNonEmptyString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Value cannot be empty. Try again.");
        }
    }
}
