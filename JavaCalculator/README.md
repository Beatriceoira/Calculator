Java Calculator

A console-based calculator application built with **Java 21**, **Maven**, and **JUnit 5**. The project demonstrates object-oriented programming, input validation, exception handling, dependency management, and automated unit testing.

Features

- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`*`)
- Division (`/`)
- Modulo (`%`)
- Power (`^`)
- Square root (`√`)
- Calculation history
- Clear calculation history
- Input validation
- Division-by-zero protection
- Negative square-root protection
- Invalid operation handling
- JUnit 5 unit tests
- Maven build and dependency management

Technologies

| Technology | Purpose                         |
| ---------- | ------------------------------- |
| Java 21    | Application development         |
| Maven      | Build and dependency management |
| JUnit 5    | Automated testing               |
| Git        | Version control                 |
| GitHub     | Source code hosting             |
| VS Code    | Development environment         |

Project Structure

```text
JavaCalculator
│
├── pom.xml
├── README.md
├── .gitignore
│
└── src
    ├── main
    │   └── java
    │       └── calculator
    │           ├── Main.java
    │           ├── Calculator.java
    │           └── Calculation.java
    │
    └── test
        └── java
            └── calculator
                └── CalculatorTest.java
```

Class Overview

`Main.java`

Handles the application's console interface.

Responsibilities:

- Display the calculator menu
- Read user input
- Process menu selections
- Display calculation results
- Manage calculation history
- Handle user-facing errors

`Calculator.java`

Contains the calculator's core mathematical logic.

Supported operations:

```text
+
-
*
/
%
^
√
```

The class also performs validation for invalid mathematical operations.

`Calculation.java`

Represents an individual calculation.

Each calculation stores:

- First number
- Operator
- Second number
- Result

The class overrides `toString()` to provide a readable representation of each calculation.

`CalculatorTest.java`

Contains automated tests using **JUnit 5**.

Tests cover:

- Addition
- Subtraction
- Multiplication
- Division
- Modulo
- Power
- Square root
- Operator-based calculations
- Division by zero
- Modulo by zero
- Negative square roots
- Invalid operators

Requirements

Before running the project, make sure you have:

- JDK 21 or later
- Apache Maven
- Git (optional, for version control)

Verify Java:

```bash
java --version
```

Verify the Java compiler:

```bash
javac --version
```

Verify Maven:

```bash
mvn --version
```

Getting Started

1. Clone the repository

```bash
git clone https://github.com/Beatriceoira/Calculator.git
```

2. Navigate to the project

```bash
cd java-calculator
```

3. Run the tests

```bash
mvn test
```

A successful test run should display:

```text
Tests run: 12, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS
```

4. Build the project

```bash
mvn clean package
```

This will:

1. Remove previous build files
2. Compile the application
3. Compile the test classes
4. Run the JUnit tests
5. Package the application

Running the Application

The easiest way to run the application during development is through VS Code.

Open:

```text
src/main/java/calculator/Main.java
```

Then click Run above:

```java
public static void main(String[] args)
```

The application will display:

```text
==========================
      JAVA CALCULATOR
==========================

--------- MENU ---------
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Modulo (%)
6. Power (^)
7. Square Root (√)
8. View History
9. Clear History
0. Exit
------------------------

Choose an option:
```

Example Usage

Addition

```text
Choose an option: 1

Enter first number: 25
Enter second number: 15

Result: 40.0
```

Power

```text
Choose an option: 6

Enter first number: 2
Enter second number: 8

Result: 256.0
```

Square Root

```text
Choose an option: 7

Enter number: 144

Result: 12.0
```

Calculation History

```text
Choose an option: 8

------- HISTORY -------
1. 25.0 + 15.0 = 40.0
2. 2.0 ^ 8.0 = 256.0
-----------------------
```

Error Handling

The calculator handles common invalid operations without crashing.

Division by Zero

```text
Enter first number: 10
Enter second number: 0

Error: Cannot divide by zero.
```

Negative Square Root

```text
Enter number: -25

Error: Cannot calculate the square root of a negative number.
```

Invalid Input

```text
Enter first number: hello

Invalid input. Please enter a number.
```

Invalid Menu Option

```text
Choose an option: 99

Invalid option. Please choose from 0-9.
```

Testing

The project uses JUnit 5 for automated unit testing.

Run all tests with:

```bash
mvn test
```

Run a clean test:

```bash
mvn clean test
```

Build and test the complete project:

```bash
mvn clean package
```

The test suite verifies both expected results and error conditions.

Maven Commands

| Command             | Description                             |
| ------------------- | --------------------------------------- |
| `mvn clean`         | Removes previous build files            |
| `mvn compile`       | Compiles the application                |
| `mvn test`          | Runs JUnit tests                        |
| `mvn clean test`    | Cleans and runs tests                   |
| `mvn package`       | Builds the project package              |
| `mvn clean package` | Cleans, tests, and packages the project |

Object-Oriented Programming

This project applies several Java OOP concepts:

* Classes and objects
* Encapsulation
* Constructors
* Instance methods
* Private fields
* Getters
* Method organization
* Separation of responsibilities

The application separates the **user interface**, **calculation logic**, and **calculation data** into different classes.

Exception Handling

The application uses Java exceptions to handle invalid operations.

Examples include:

```java
ArithmeticException
```

for:

* Division by zero
* Modulo by zero
* Negative square roots

And:

```java
IllegalArgumentException
```

for invalid operators.

Learning Objectives

This project was developed to strengthen practical Java development skills, including:

* Java 21 fundamentals
* Object-oriented programming
* Maven project management
* Dependency management
* JUnit 5 testing
* Exception handling
* Input validation
* Collections
* Unit testing
* Git version control
* GitHub project management

