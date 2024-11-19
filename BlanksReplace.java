import java.util.Scanner;

public class BlanksReplace {
    String input;
    String result;

    BlanksReplace() {
        input = "";
        result = "";
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        input = scanner.nextLine();
        scanner.close();
    }

    void replace() {
        result = "";
        boolean lastWasSpace = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == ' ') {
                if (!lastWasSpace) {
                    result += c;
                    lastWasSpace = true; }
            } else {
                result += c;
                lastWasSpace = false;
            }  }  }

    void print() {
        System.out.println("Modified sentence: " + result);
    }

    public static void main(String[] args) {
        BlanksReplace rb = new BlanksReplace();
        rb.input();
        rb.replace();
        rb.print();
    }  }
