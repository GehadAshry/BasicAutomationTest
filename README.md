# BasicAutomationTest

# Automation Test for Web Form Submission

This project is an **automated test suite** designed to validate the functionality of a web form using **Selenium WebDriver** and **Java**. The tests cover various form fields, including text inputs, dropdowns, checkboxes, radio buttons, file uploads, color pickers, date pickers, and range sliders. The project follows the **Page Object Model (POM)** design pattern for better maintainability and reusability of the test scripts.

---

## Key Features

- **Comprehensive Test Coverage**: Validates all fields of the web form, ensuring proper functionality and user interaction.
- **Page Object Model (POM)**: Implements the POM design pattern to separate test logic from page-specific code.
- **Cross-Browser Testing**: Supports testing on multiple browsers (e.g., Chrome, Edge, Firefox).
- **Modular and Scalable**: Easy to extend with additional test cases or pages.

---

## Technologies Used

- **Selenium WebDriver**: For browser automation.
- **Java**: Programming language for writing test scripts.
- **TestNG**: Test framework for organizing and running test cases.
- **Maven**: Build automation and dependency management.
- **WebDriverManager**: For automatic management of browser drivers.

---

## Project Structure
automation-test/

├── src/

│ ├── main/

│ │ └── java/

│ │ └── WebForm/

│ │ ├── WebFormPage.java # Page Object for the web form

│ │ └── FormSubmittedPage.java # Page Object for the submission confirmation page

│ └── test/

│ └── java/

│ ├── BaseTest/

│ │ └── SetUpTest.java # Test setup and teardown

│ └── FillFormTest/

│ └── FillFormTest.java # Test cases for the web form

├── pom.xml # Maven configuration file

└── README.md # Project documentation


---

## How to Run the Tests

### Prerequisites

- Install [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (version 8 or higher).
- Install [Maven](https://maven.apache.org/download.cgi).
- Install a browser (e.g., Chrome, Edge, Firefox).

### Clone the Repository

```bash
git clone [https://github.com/your-username/automation-test](https://github.com/GehadAshry/BasicAutomationTest).git
cd automation-test
```

### Run the test

Use Maven to run the tests:

```bash
mvn test
```

### View Test Results

* Test results will be displayed in the console.
* Detailed reports can be found in the target/surefire-reports directory.
