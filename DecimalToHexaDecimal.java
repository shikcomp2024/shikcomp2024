import java.util.Scanner;

public class DecimalToHexaDecimal {
    Scanner sc = new Scanner(System.in);
    int input;
    int remainder;
    String converted;

    DecimalToHexaDecimal() {
        input = 0;
        remainder = 0;
        converted = "";
    }

    void input() {
        System.out.println("Enter the decimal number:");
        input = sc.nextInt();
    }

    void convert() {
        
        while (input != 0) {
            remainder = input % 16;
            for (int i = 10; i <= 15; i++) {
                if (remainder == i) {
                    converted = Character.toString((char)('A' + i - 10)) + converted;
                    break;
                }
            }
            if (remainder < 10 || remainder > 15) {
                converted = remainder + converted;
            }
            input /= 16;
        }
    }

    void print() {
        System.out.println("This is the Hexa Decimal Equivalent :" + converted);
    }

    public static void main(String[] args) {
        DecimalToHexaDecimal ob = new DecimalToHexaDecimal();
        ob.input();
        ob.convert();
        ob.print();
    }
}
