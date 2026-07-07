# Java Quiz Game

A simple console-based multiple-choice quiz game written in Java. The program presents 10 Java-related questions to the user, collects their answers, and displays a final score.

## Features

- 10 built-in multiple-choice questions covering core Java concepts
- Reads user answers from the console
- Calculates and displays the final score at the end of the quiz

## Project Structure

File --> Description

`Main.java` --> Entry point of the application. Creates a `QuestionService` instance, runs the quiz, and prints the score. 
`Question.java` -->  Model class representing a single quiz question (id, question text, four options, and the correct answer), with getters/setters and a `toString()` override. 
`QuestionService.java` --> Holds the array of `Question` objects, handles displaying questions, capturing user input, and scoring. 

## How It Works

1. `QuestionService` is initialized with 10 predefined `Question` objects (each with an id, question text, four options, and the correct answer).
2. `playQuiz()` iterates through all questions, printing the question and its four options, then reads the user's typed answer via `Scanner`.
3. User responses are stored in a `selection` array.
4. `printScore()` compares each stored user answer against the correct answer for that question and tallies the total score.
5. The final score out of 10 is printed to the console.

## How to Run

1. Make sure you have a JDK installed (Java 8 or higher).
2. Compile all three files:
   ```bash
   javac Main.java Question.java QuestionService.java
   ```
3. Run the program:
   ```bash
   java Main
   ```
4. For each question, type your answer exactly as shown in the options (e.g. `new`, `main()`, `HashSet`) and press Enter.
5. After all 10 questions, your score will be displayed.

## Sample Interaction

```
**Welcome to Quize Game**
Question no. : 1
Which keyword is used to create an object in Java?
class
new
this
static
new
```

## Known Issues / Suggestions for Improvement

- **Answer matching is case- and exact-text-sensitive.** Since answers are compared with `String.equals()` against the exact option text, minor typos or different casing will count as wrong. Consider trimming input and using `equalsIgnoreCase()`.
- **No option labels (A/B/C/D).** Users must type the full option text instead of selecting a letter/number, which is error-prone. Adding labeled choices (1–4) and matching by index would improve usability.
- **Typo in welcome message:** `"/n"` is printed literally instead of creating a newline; it should be `"\n"`.
- **Hardcoded questions.** Questions are hardcoded in the `QuestionService` constructor. Loading them from a file or database would make the quiz easier to extend.
- **New `Scanner` created per loop iteration.** A single `Scanner` instance should be created once (e.g., as a field or passed in) rather than inside the loop.

## License

This project is provided as-is for educational purposes.
