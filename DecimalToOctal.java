import java.util.Scanner;

public class DecimalToOctal {
    Scanner sc = new Scanner(System.in);

    String input;
    int intPart;
    String converted;

    DecimalToOctal() {
        input = " ";
        intPart = 0;
        converted = " ";
    }

    void input() {
        System.out.println("Enter the number:");
        input = sc.next();
    }

    void split() {
        String str1 = input.contains(".") ? input.substring(0, input.indexOf('.')) : input;
        intPart = Integer.parseInt(str1);
    }

    void convert() {
        int remainder;
        String integerPart = "";

        while (intPart != 0) {
            remainder = intPart % 8;
            integerPart = remainder + integerPart;
            intPart /= 8;
        }

        converted = integerPart;
    }

    void print() {
        System.out.println("Octal equivalent: " + converted);
    }

    public static void main(String[] args) {
        DecimalToOctal ob = new DecimalToOctal();
        ob.input();
        ob.split();
        ob.convert();
        ob.print();
    }
}
