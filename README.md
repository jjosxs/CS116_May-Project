# CS-116 Project: Java Course Registration System

 This project is a simplified course-registration program implemented in Java. It simulates a scenario where a student accesses a school's database to register for Computer Science (CS) courses for the upcoming semester.
=======
This project is a simplified course-registration program implemented in JavaIt simulates a scenario where a student accesses a school's database to register for Computer Science (CS) courses for the upcoming semester The system reads input files containing course and student data, allows users to interact via the console, and updates the database files upon exiting
ubsequent sessions.

## Features

* **View Available Courses:** Print in the console all the courses provided in the following semester, sorted by course ID.
* **View Course History:** Print all the courses that the user has taken before.
* **Search:** Search for specific courses by their course ID.
* **Register for Courses:** Register for a next-semester course, subject to the following rules:
    * The student must have taken all prerequisites.
    * The course must still have open seats.
    * A student can register for a maximum of 5 courses per semester.
    * A student cannot register for a course they have already taken.
    * A student cannot register for the same course multiple times.
* **Cancel Registration:** Cancel a course that was successfully registered for the coming semester, including courses registered in previous runs of the program.
* **Data Persistence:** Exit the program and write the updated registration information directly back into `file1` (updating the Status columns) and `file2`.

## Project Structure

* **`Course` Class**: Stores course information including a String ID, a String name, the number of total seats, the number of registered seats, and course prerequisites.
* **`Student` Class**: Stores student information including a String ID (A-number), a String name, previously taken courses, and courses the student is about to take next semester.
* **Client Class**: Acts as the main entry point and driver for the program.

## Optional Goals

* Use at least one user-defined interface or abstract class.
* Implement a custom data structure (e.g., an ArrayList-like structure) to handle data.
* Demonstrate polymorphism in the code.
* Use the Merge Sort algorithm for sorting operations.
* Use the Binary Search algorithm for searching operations.
* Successfully realize the "canceling a registered course" function.
* Add two additional reasonable and useful functions.
* Handle exceptions and invalid inputs gracefully without breaking the program's flow.
=======
* The program must be implemented as a new Java project[cite: 26].
* Ensure that the input data files, referred to as `file1` (e.g., "CS-26F.txt") and `file2` (e.g., "A20123456.txt"), are placed within the same Java project directory[cite: 10, 11, 13, 14, 48, 59].

## Usage

* Run the client class to start the application
* Follow the console prompts, which provide clear and accurate guides to input files and choose functions[cite: 46].
* The program will continue to run and will only terminate if you explicitly choose the exit function.
* After a course is registered or rejected, the program will give clear responses in the console[cite: 86].
* Upon exiting, the program updates the data files, allowing you to use the updated `file1` and `file2` to run the program again in subsequent sessions[cite: 24].

