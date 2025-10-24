package NumberPatterns;

import java.util.Scanner;

public class NumberPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a pattern to print:");
        System.out.println("1. Increasing Right Angle");
        System.out.println("2. Decreasing Left Angle");
        System.out.println("3. Hill Pattern");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        switch (choice) {
            case 1:
                // Increasing Right Angle
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;

            case 2:
                // Decreasing Right Angle
                for (int i = rows; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;

            case 3:
                // Hill Pattern
                for (int i = 1; i <= rows; i++) {
                    // spaces before numbers
                    for (int j = i; j < rows; j++) {
                        System.out.print(" ");
                    }
                    // left side
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i);
                    }
                    // right side
                    for (int j = 1; j < i; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }

        sc.close();
    }
}
