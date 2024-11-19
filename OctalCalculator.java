import java.util.Scanner;

public class OctalCalculator {
    // Method to convert octal to decimal
    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    // Method to convert decimal to octal
    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first octal number
        System.out.print("Enter the first octal number: ");
        String firstOctal = scanner.nextLine();

        // Prompt user for the second octal number
        System.out.print("Enter the second octal number: ");
        String secondOctal = scanner.nextLine();

        // Convert octal inputs to decimal
        int firstDecimal = octalToDecimal(firstOctal);
        int secondDecimal = octalToDecimal(secondOctal);

        // Perform addition
        int sumDecimal = firstDecimal + secondDecimal;
        String sumOctal = decimalToOctal(sumDecimal);

        // Perform subtraction
        int diffDecimal = firstDecimal - secondDecimal;
        String diffOctal = decimalToOctal(diffDecimal);

        // Display results
        System.out.println("Sum of octal numbers: " + sumOctal);
        System.out.println("Difference of octal numbers: " + diffOctal);
    }
}
