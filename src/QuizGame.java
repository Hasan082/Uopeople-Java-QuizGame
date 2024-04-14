import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize score
        int score = 0;

        // Display instructions
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Answer the following questions by typing the corresponding letter (A, B, C, or D).\n");

        // Questions and correct answers
        String[] questions = {
                "Which artist created the 'Starry Night' painting?",
                "What is the capital city of Australia?",
                "What is the world's largest desert?",
                "Which planet is known as the 'Red Planet'?",
                "Who wrote 'To Kill a Mockingbird'?"
        };
        String[] options = {
                "A. Pablo Picasso\tB. Vincent van Gogh\tC. Leonardo da Vinci\tD. Michelangelo",
                "A. Sydney\tB. Canberra\tC. Melbourne\tD. Brisbane",
                "A. Sahara Desert\tB. Gobi Desert\tC. Arabian Desert\tD. Antarctic Desert",
                "A. Venus\tB. Mars\tC. Jupiter\tD. Saturn",
                "A. Harper Lee\tB. J.K. Rowling\tC. Charles Dickens\tD. F. Scott Fitzgerald"
        };
        char[] answers = { 'B', 'B', 'A', 'B', 'A' };

        // Present questions and prompt for answers
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.print("Your answer: ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            // Check if answer is correct && Increment score for correct answer
            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + answers[i] + ".\n");
            }
        }

        // Calculate and display final score
        double percentage = (double) score / questions.length * 100;
        System.out.println("Quiz completed!");
        System.out.println("Your final score: " + score + "/" + questions.length + " (" + percentage + "%)");

        scanner.close(); // Close the scanner to release resources
    }
}
