
```markdown
# Assignment1_C0930172

This project is a Java-based object-oriented programming (OOP) assignment that models a `Person` and their optional `Dog`. It includes JUnit test cases to validate functionality.

---

## 📂 Project Structure

```
.
├── src
│   ├── com/example/Assignment1/
│   │   ├── Dog.java
│   │   ├── Person.java
│   │   ├── Main.java
│   ├── test/com/example/Assignment1/
│   │   ├── DogTest.java
│   │   ├── PersonTest.java
```

---

## 🎯 Features

### **👤 Person Class**
- Represents a person with attributes: `name`, `age`, and an optional `Dog`.
- Methods:
  - `hasOldDog()`: Checks if the dog is **10+ years old**.
  - `changeDogsName(newName)`: Changes the dog's name if they own one (**throws exception otherwise**).

### **🐶 Dog Class**
- Represents a dog with attributes: `name` and `age`.
- Implements `equals()` and `hashCode()` for object comparison.

### **🖥️ Main Class**
- Demonstrates functionality by:
  - Creating `Person` and `Dog` objects.
  - Handling cases where a person **does or does not own a dog**.

---

## ✅ JUnit Tests

### **📌 DogTest.java**
| **Test Name**             | **Description** |
|---------------------------|----------------|
| `testDogInitialization()` | Ensures `Dog` objects are correctly initialized. |
| `testSetName()`           | Verifies that `setName()` updates a dog's name properly. |

#### Example:
```java
@Test
void testDogInitialization() {
    Dog dog = new Dog("Rock", 5);
    assertEquals("Rock", dog.getName());
    assertEquals(5, dog.getAge());
}
```

---

### **📌 PersonTest.java**
| **Test Name**                  | **Description** |
|---------------------------------|----------------|
| `testPersonWithoutDog()`        | Ensures a `Person` can exist without a dog. |
| `testPersonWithDog()`           | Ensures a `Person` with a `Dog` has correct attributes. |
| `testHasOldDog()`               | Checks if `hasOldDog()` correctly identifies old dogs (10+ years). |
| `testChangeDogsNameSuccess()`   | Ensures `changeDogsName()` updates a dog’s name. |
| `testChangeDogsNameFailure()`   | Ensures an exception is thrown when renaming a non-existent dog. |

#### Example:
```java
@Test
void testChangeDogsNameFailure() {
    Person person = new Person("Michael", 40);
    RuntimeException exception = assertThrows(RuntimeException.class, () -> person.changeDogsName("Rex"));
    assertEquals("Michael does not own a dog!", exception.getMessage());
}
```

---

## ⚙️ Setup & Execution

### **📌 Requirements**
- **Java 8+**
- **JUnit 5**
- **Maven** (optional, for easier test execution)

### **▶️ Running the Program**
Compile and run:
```sh
javac -d out src/com/example/Assignment1/*.java
java -cp out com.example.Assignment1.Main
```

### **🛠 Running Tests**
Run tests using Maven:
```sh
mvn test
```
Or manually via:
```sh
javac -cp .:junit-5.jar test/com/example/Assignment1/*.java
java -cp .:junit-5.jar org.junit.platform.console.ConsoleLauncher --select-class com.example.Assignment1.DogTest --select-class com.example.Assignment1.PersonTest
```

---
## 👨‍💻 Author
Unni Krishna Prasad Endla

---
