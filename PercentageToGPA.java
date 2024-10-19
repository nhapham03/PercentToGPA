import java.util.Scanner;

public class PercentageToGPA {
    public static void main(String[] args) {
        double percentage = -1.0; // for validating user's input

        Scanner scanner = new Scanner(System.in);

        // Loop for validating percentage input
        while (percentage < 0.0 || percentage > 100.0) {
            System.out.print("Enter your percentage (from 0.0 to 100.0): ");
            if (scanner.hasNextDouble()) { // Check if input is a valid double
                percentage = scanner.nextDouble();
                if (percentage < 0.0 || percentage > 100.0) {
                    System.out.println("Invalid input, please enter a value between 0.0 and 100.0.");
                }
            } else {
                System.out.println("Invalid input, please enter a numeric value.");
                scanner.next(); // Discard invalid input
            }
        }

        System.out.println("Your Percentage is " + percentage);

        // Convert percentage to GPA using if-else statements
        if (percentage >= 95.0) {
            System.out.println("Your GPA is 4.0");
        } else if (percentage >= 94.0) {
            System.out.println("Your GPA is 3.9");
        } else if (percentage >= 93.0) {
            System.out.println("Your GPA is 3.8");
        } else if (percentage >= 92.0) {
            System.out.println("Your GPA is 3.7");
        } else if (percentage >= 91.0) {
            System.out.println("Your GPA is 3.6");
        } else if (percentage >= 90.0) {
            System.out.println("Your GPA is 3.5");
        } else if (percentage >= 89.0) {
            System.out.println("Your GPA is 3.4");
        } else if (percentage >= 88.0) {
            System.out.println("Your GPA is 3.3");
        } else if (percentage >= 87.0) {
            System.out.println("Your GPA is 3.2");
        } else if (percentage >= 86.0) {
            System.out.println("Your GPA is 3.1");
        } else if (percentage >= 85.0) {
            System.out.println("Your GPA is 3.0");
        } else if (percentage >= 84.0) {
            System.out.println("Your GPA is 2.9");
        } else if (percentage >= 83.0) {
            System.out.println("Your GPA is 2.8");
        } else if (percentage >= 82.0) {
            System.out.println("Your GPA is 2.7");
        } else if (percentage >= 81.0) {
            System.out.println("Your GPA is 2.6");
        } else if (percentage >= 80.0) {
            System.out.println("Your GPA is 2.5");
        } else if (percentage >= 79.0) {
            System.out.println("Your GPA is 2.4");
        } else if (percentage >= 78.0) {
            System.out.println("Your GPA is 2.3");
        } else if (percentage >= 77.0) {
            System.out.println("Your GPA is 2.2");
        } else if (percentage >= 76.0) {
            System.out.println("Your GPA is 2.1");
        } else if (percentage >= 75.0) {
            System.out.println("Your GPA is 2.0");
        } else if (percentage >= 74.0) {
            System.out.println("Your GPA is 1.9");
        } else if (percentage >= 73.0) {
            System.out.println("Your GPA is 1.8");
        } else if (percentage >= 72.0) {
            System.out.println("Your GPA is 1.7");
        } else if (percentage >= 71.0) {
            System.out.println("Your GPA is 1.6");
        } else if (percentage >= 70.0) {
            System.out.println("Your GPA is 1.5");
        } else if (percentage >= 69.0) {
            System.out.println("Your GPA is 1.4");
        } else if (percentage >= 68.0) {
            System.out.println("Your GPA is 1.3");
        } else if (percentage >= 67.0) {
            System.out.println("Your GPA is 1.2");
        } else if (percentage >= 66.0) {
            System.out.println("Your GPA is 1.1");
        } else if (percentage >= 65.0) {
            System.out.println("Your GPA is 1.0");
        } else {
            System.out.println("Your GPA is 0.0");
        }

        // Close the scanner
        scanner.close();
    }
}
