# <img src="https://github.com/khushi703/Incubyte-TDD-Assessment/blob/main/Incubyte.png" alt="Incubyte Logo" width="30"> Incubyte-TDD-Assessment

<h1>String Calculator</h1>
<p><i>A clean, test-driven solution for string-based arithmetic operations.</i></p>

---

## 🔢 About the Kata

This kata was completed as part of the **Incubyte TDD Assessment**, inspired by Roy Osherove’s String Calculator challenge.  
The objective was to implement the `StringCalculator` class using a disciplined **Test Driven Development (TDD)** approach — writing tests before any production code and growing functionality incrementally through red-green-refactor cycles.

This kata provided an opportunity to:
- Practice and demonstrate **real-world TDD workflows** using Java.
- Apply the **Three Laws of TDD** consistently across all steps.
- Start from the **simplest possible case**, and extend functionality only through failing tests.
- Write **clean, modular, and well-validated code** through unit tests.
- Embrace a software engineering mindset focused on **safety, simplicity, and incremental delivery**.

---

## ⚙️ Development Methodology: Three Laws of TDD

This kata was implemented following the **Three Laws of Test Driven Development**:

1. **Write no production code unless to make a failing test pass.**  
2. **Write only enough test code to fail (compilation failures count).**  
3. **Write only enough production code to pass the failing test.**

This ensured that the code evolved step by step, backed by meaningful tests at every stage.

---

## ✅ Test Cases Covered

The following functional test cases were written and validated:

- ✔️ Return `0` for an empty string or `null` input.
- ✔️ Return a single number if only one is provided (e.g., `"5"` returns `5`).
- ✔️ Add two comma-separated numbers (e.g., `"2,3"` returns `5`).
- ✔️ Add an unknown number of comma-separated numbers.
- ✔️ Support newline (`\n`) as a valid delimiter, alongside commas.
- ✔️ Support custom single-character delimiters (e.g., `"//;\n1;2"`).
- ✔️ Throw exception for negative numbers with a detailed message.
- ✔️ Handle multiple negative numbers in a single error message.
- ✔️ Ignore numbers greater than `1000` (e.g., `"2,1001"` returns `2`).
- ✔️ Support multi-character delimiters (e.g., `"//[***]\n1***2***3"`).
- ✔️ Support multiple delimiters (e.g., `"//[*][%]\n1*2%3"`).
- ✔️ Support multiple delimiters with multiple characters (e.g., `"//[##][!!]\n1##2!!3"`).

---

## 🧪 Test Results

All test cases were written and executed using a strict TDD approach.  
The image below shows the successful execution of all defined test cases.

![Test Execution Results](https://github.com/khushi703/Incubyte-TDD-Assessment/blob/main/src/main/TestResult.png?raw=true)

---

## 🧰 This kata was implemented using:

- **Java 22**
- **Maven**
- **JUnit 4.13.2** with `@Test` annotations

## 🏁 Final Note

_Completed as part of the Incubyte hiring assessment using disciplined TDD principles._
