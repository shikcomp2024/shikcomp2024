import java.util.Scanner;
public class PalindromeWord {
    Scanner sc = new Scanner(System.in);

    String input;
    String capitalInput;
    String reversed;

    PalindromeWord() {
        input = "";
        capitalInput = "";
        reversed = "";  }

    void getInput() {
        System.out.println("Enter the word:");
        input = sc.next();    }

    void toUppercase() {
        capitalInput = input.toUpperCase();  }

    void reverse() {
        char ch;
        int n = capitalInput.length();

        for (int i = n - 1; i >= 0; i--) {
            ch = capitalInput.charAt(i);
            reversed = reversed + ch;
        }  }

    void check() {
        if (capitalInput.equals(reversed)) {
            System.out.println("It is a palindrome word");
        } else {
            System.out.println("Not a palindrome");
        }  }

    public static void main(String[] args) {
        PalindromeWord ob = new PalindromeWord();
        ob.getInput();
        ob.toUppercase();
        ob.reverse();
        ob.check();
    }
}
