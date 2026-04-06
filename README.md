# Java Programming Examples (Educational Project)

This repository contains beginner-to-intermediate Java examples organized by topic.  
It is built for **learning and practice**, with short programs you can run individually to understand core Java concepts.

## 📚 Topics Covered

The project is structured into folders inside `src/`, each focusing on a specific concept:

- **Basics** – variables, operators, type casting, `this`/`super`, `static`, `final`
- **Control Flow** – `if/else`, `switch`, loops (`for`, `while`)
- **Arrays** – one-dimensional, multidimensional, jagged arrays
- **Methods** – method creation and usage
- **Strings** – string operations
- **User Input** – `Scanner`, `BufferedReader`
- **Collections / Maps** – collection classes and key-value data structures
- **Object-Oriented Programming**
  - Constructors
  - Encapsulation
  - Inheritance
  - Polymorphism
  - Abstraction
  - Interfaces
  - Inner/Anonymous classes
- **Enums & Annotations**
- **Exceptions** – basic exception handling
- **Threads** – introductory multithreading
- **Lambda Expressions**
- **Stream API**
- **Generics** – generic classes, methods, and bounded types
- **File I/O / NIO** – reading, writing, appending, and file metadata with `java.nio.file`
- **Serialization / Deserialization** – save Java objects to file and restore them
- **JDBC** – connecting Java to PostgreSQL (`postgresql-42.7.3.jar` included)

## 🧩 Added Practice Project: Student Record Manager

I added a complete mini-project you can include in your Java course portfolio:

- Path: `src/Projects/StudentRecordManager/`
- Files:
  - `Student.java` (model class)
  - `StudentManager.java` (business logic with CRUD + file persistence)
  - `Main.java` (menu-driven console app)

### Features implemented

- Add, update, remove, and find students by ID
- List all students
- Sort students by grade (high to low)
- Filter students by course
- Calculate average grade and total student count
- Save/load data to `data/students.csv`
- Input validation and basic error handling

### Run the Student Record Manager

From inside the `Java Programing` directory:

```bash
javac -d out src/Projects/StudentRecordManager/*.java
java -cp out Projects.StudentRecordManager.Main
```

## 🚀 10 More Practice Projects Added

To strengthen your learning, I also added **10 extra mini-projects** under `src/Projects/`:

1. `ToDoList` – add/view/remove daily tasks
2. `CalculatorApp` – basic arithmetic operations
3. `NumberGuessingGame` – random number game with attempts
4. `TemperatureConverter` – Celsius/Fahrenheit converter
5. `PalindromeChecker` – checks if text is a palindrome
6. `ExpenseTracker` – track and total expenses
7. `ContactBook` – save and search contacts
8. `SimpleQuiz` – short Java quiz with score output
9. `LibraryManager` – borrow/return available books
10. `WordCounter` – counts words and frequency in a sentence

### Run any of the new projects

Compile all project classes:

```bash
javac -d out src/Projects/*/*.java
```

Then run any one project, for example:

```bash
java -cp out Projects.ToDoList.Main
java -cp out Projects.CalculatorApp.Main
java -cp out Projects.NumberGuessingGame.Main
```

## 🗂️ Project Structure

```text
Java Programing/
├── src/
│   ├── Basics/
│   ├── ControlFlow/
│   ├── Arrays/
│   ├── ObjectOrientedProgramming/
│   ├── Collections/
│   ├── Maps/
│   ├── StreamAPI/
│   └── ...
└── postgresql-42.7.3.jar
```

> Note: Folder names and package names are case-sensitive.

## ✅ Requirements

- Java JDK 8+ (recommended: JDK 17 or newer)
- A Java IDE (IntelliJ IDEA, VS Code, Eclipse) or terminal
- PostgreSQL (only for JDBC examples)

## ▶️ How to Run Examples

Each file has its own `main` method and can be run independently.

### Run from an IDE

1. Open the `Java Programing` folder as a project.
2. Navigate to any class in `src/`.
3. Run the class with `main`.

### Run from terminal (example)

From inside the `Java Programing` directory:

```bash
javac -d out src/Maps/MapsExample.java
java -cp out Maps.MapsExample
```

For package-based classes, use the fully-qualified class name (e.g., `Basics.VariablesExample`).

## 🛢️ JDBC Note

The JDBC sample uses local PostgreSQL connection details and a sample table query.  
Before running JDBC examples, update these values in `src/jdbc/JdbcExample.java`:

- URL
- username
- password
- SQL query/table names

⚠️ For public repositories, avoid committing real passwords. Prefer environment variables or a local config file ignored by Git.

## 🎯 Purpose

This repository is for **educational purposes** and serves as a personal reference while learning Java fundamentals and core APIs.

## 🤝 Contributions

This is mainly a study project, but suggestions and improvements are welcome through issues or pull requests.
