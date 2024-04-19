## Quize Game Using Java

### Problem Statement

You are tasked with creating a Java program that simulates a simple quiz game. The program should prompt the user with a series of questions and allow them to enter their answers. After the user has answered all the questions, the program should compute and display the final score based on the number of correct answers.

Write a Java program that implements the functionality described in the scenario. Ensure that your program is error-free, compiles successfully, and produces the expected output. Test your program with different inputs to verify its correctness.

Make sure the following requirements are met:

The program should include five multiple-choice questions with four options.
The four options should be labeled A, B, C, and D.
The program should prompt the user to enter their answer by typing the corresponding letter (A, B, C, or D).
After the user has entered their answer for each question, the program should compare it to the correct answer and keep track of the number of correct responses.
The program should compute and display the final score as a percentage of the total number of questions.
Use if and switch case statements to handle user input and compare it to the correct answers.
Include comments to explain the purpose of each section of code and enhance code readability.



### Explanation:

Importing Scanner Class: The program imports the Scanner class from the java.util package to facilitate user input.

Main Method: The main method is the entry point of the program.

Initializing Variables: The program initializes the score variable to keep track of the user's score.

Display Instructions: The program displays instructions for the quiz game.

Declaring Questions, Options, and Answers: Arrays questions, options, and answers are declared to store the quiz questions, options, and correct answers respectively.

Presenting Questions and Prompting for Answers: A for loop iterates over each question. For each question, it displays the question, options, prompts the user for input, and checks if the user's answer is correct. It increments the score if the answer is correct.

Calculating and Displaying Final Score: After all questions are answered, the program calculates the final score as a percentage and displays it along with the number of correct answers.

Closing Scanner: Finally, the scanner.close() statement is used to close the scanner object and release associated resources.

This program allows users to take a quiz by answering multiple-choice questions and provides feedback on their performance at the end.



