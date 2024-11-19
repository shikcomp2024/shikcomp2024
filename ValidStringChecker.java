import java.util.Scanner;

public class ValidStringChecker {
    String input;
    boolean isValid;
    String result;

    ValidStringChecker() {
        input = "";
        isValid = true;
        result = "";
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        input = scanner.nextLine();
        scanner.close();
    }

    void uppercase() {
        input = input.toUpperCase();
    }

    void validity() {
        int openCount = 0;
        boolean insideParentheses = false;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                if (insideParentheses) {
                    isValid = false;
                    return;
                }
                insideParentheses = true;
                openCount++;
            } else if (c == ')') {
                if (!insideParentheses) {
                    isValid = false;
                    return;
                }
                insideParentheses = false;
            } else if (!insideParentheses) {
                builder.append(c);
            }
            System.out.println(result.length());
        }

        if (insideParentheses) {
            isValid = false;
        }

        result = builder.toString();
    }

    void print() {
        if (isValid) {
            System.out.println("String is valid " + result);
        } else {
            System.out.println("Sorry, an invalid string");
        }
    }

    public static void main(String[] args) {
        ValidStringChecker checker = new ValidStringChecker();
        checker.input();
        checker.uppercase();
        checker.validity();
        checker.print();
        
    }
}
