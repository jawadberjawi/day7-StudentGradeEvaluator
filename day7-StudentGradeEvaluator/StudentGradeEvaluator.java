import java.util.Scanner;

public class StudentGradeEvaluator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // Create Scanner object

        System.out.print("What is your name? ");
        String name = input.next();  // Read user's name

        System.out.print("What is your Math grade? ");
        double math = input.nextDouble();  // Read Math grade

        System.out.print("What is your Physics grade? ");
        double physics = input.nextDouble();  // Read Physics grade

        System.out.print("What is your Chemistry grade? ");
        double chemistry = input.nextDouble();  // Read Chemistry grade

        double average = (math + physics + chemistry) / 3;  // Calculate average

        System.out.println("Your average is: " + average);  // Print average

        if (average >= 50) {
            System.out.println("Congratulations " + name + ", you passed!");
        } else {
            System.out.println("Sorry " + name + ", you failed. Better luck next time.");
        }

        // Determine grade letter based on average
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Give feedback using switch
        switch (grade) {
            case 'A':
                System.out.println("Excellent performance!");
                break;
            case 'B':
                System.out.println("Very good job!");
                break;
            case 'C':
                System.out.println("Good effort.");
                break;
            case 'D':
                System.out.println("You passed, but you can improve.");
                break;
            case 'F':
                System.out.println("Work harder next time.");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        input.close(); // Close scanner
    }
}

















