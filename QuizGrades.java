import java.util.Scanner;

public class QuizGrades {

    public static void main(String[] args) {
        // Print the programming specifications
        printProgrammingSpecifications();

        // Initialize the variables
        int[] quizGrades = new int[10];
        int gradeCount = 0;
        int totalScore = 0;
        int averageScore = 0;
        String letterGrade = "";

        // Get the first quiz grade from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first quiz grade: ");
        int grade = scanner.nextInt();

        // Add the grade to the array and increment the grade count
        quizGrades[gradeCount] = grade;
        gradeCount++;

        // Loop to get the remaining quiz grades from the user
            while (grade != 999 && gradeCount < 10) {
                System.out.print("Enter the next quiz grade (999 to quit): ");
                    grade = scanner.nextInt();

            // Add the grade to the array and increment the grade count
            quizGrades[gradeCount] = grade;
            gradeCount++;
        }


        // Calculate the total score
        for (int i = 0; i < gradeCount; i++) {
            totalScore += quizGrades[i];
        }

        // Calculate the average score
        averageScore = totalScore / gradeCount;

        // Get the letter grade for the average score
        switch (averageScore / 10) {
            case 9:
                letterGrade = "A";
                break;
            case 8:
                letterGrade = "B";
                break;
            case 7:
                letterGrade = "C";
                break;
            case 6:
                letterGrade = "D";
                break;
            default:
                letterGrade = "F";
                break;
        }

        // Print the quiz grades
        System.out.println("The quiz grades are:");
        for (int i = 0; i < gradeCount; i++) {
            System.out.print(quizGrades[i] + " ");
        }

        // Print the average score
        System.out.println("\nThe average score is: " + averageScore);

        // Print the letter grade
        System.out.println("The letter grade is: " + letterGrade);
    }

    private static void printProgrammingSpecifications() {
        System.out.println("This program calculates the quiz grades for a student and prints the letter grade.");
        System.out.println("The program allows the user to enter up to 10 quiz grades.");
        System.out.println("The grades are then averaged and the letter grade is determined based on the following grading scale:");
        System.out.println("A = 90-100");
        System.out.println("B = 80-89");
        System.out.println("C = 70-79");
        System.out.println("D = 60-69");
        System.out.println("F = 0-59");
    }
}
