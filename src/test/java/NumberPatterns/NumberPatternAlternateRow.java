package NumberPatterns;

public class NumberPatternAlternateRow {

    // Increasing pattern
    public static void alternateNumbers(int rows) {
        for (int i = 1; i <= rows; i++) {
            int numToPrint = (i % 2 == 0) ? 2 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(numToPrint);
            }
            System.out.println();
        }
    }

    // Decreasing pattern
    public static void alternateNumbersDecreasing(int rows) {
        for (int i = rows; i >= 1; i--) { // fix here
            int numToPrint = (i % 2 == 0) ? 2 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(numToPrint);
            }
            System.out.println();
        }
    }

    public static void hillPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            int numToPrint = (i % 2 == 0) ? 2 : 1; // alternate row number

            // print spaces for pyramid shape
            for (int s = i; s < rows; s++) {
                System.out.print(" ");
            }

            // print numbers for left + right side of hill
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(numToPrint);
            }

            // move to next row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Increasing pattern:");
        alternateNumbers(5);

        System.out.println("\nDecreasing pattern:");
        alternateNumbersDecreasing(5);

        System.out.println("\nHill pattern:");
        hillPattern(5);
    }
}
