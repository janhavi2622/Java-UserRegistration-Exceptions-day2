# 📋 UserRegistration-ExceptionHandling-Java
This project demonstrates a **real-world Java application** using **exception handling** techniques including:
* Multiple `try-catch` blocks
* `finally` block
* Custom exception (`InvalidAgeException`)
* Input validation (email format, age restriction)
The project simulates a **user registration form** where input is validated and appropriate exceptions are handled gracefully.

## 🧠 Concepts Covered
* ✅ Java `try-catch-finally` block
* ✅ Handling standard exceptions:
  * `NumberFormatException`
  * `IllegalArgumentException`
* ✅ Creating and throwing a custom exception: `InvalidAgeException`
* ✅ Regex validation for email format
* ✅ Real-world input validation use case
* 
## 🚀 How to Run
### ✅ Requirements
* Java JDK 8 or above
* Any Java IDE or terminal with `javac` and `java`

### ▶️ Compile & Run
cd src
javac UserRegistration.java
java UserRegistration

You’ll be prompted to enter your email and age.

## 💻 Sample Output
**Valid Input:**
Enter your email: janedoe@gmail.com
Enter your age: 22
Registration successful ✅
Registration process completed. ✅
**Invalid Email:**
Enter your email: janedoegmail.com
Enter your age: 25
Validation Error: Invalid email format!
Registration process completed. ✅
**Underage:**
Enter your email: janedoe@gmail.com
Enter your age: 15
Custom Exception: User must be at least 18 years old to register.
Registration process completed. ✅
