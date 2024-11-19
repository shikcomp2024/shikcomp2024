import java.util.Scanner;

public class BinaryToHexaDecimal {
    String str;
    long num;

    BinaryToHexaDecimal() {
        str = "";
        num = 0;
    }

    public static void main(String args[]) {
        BinaryToHexaDecimal ob = new BinaryToHexaDecimal();
        ob.Accept();
        ob.Convert();
        ob.Display();
    }

    void Accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        String input = scanner.nextLine();
        num = Long.parseLong(input, 2);
        scanner.close();
    }

    void Convert() {
        long dnum = num;

        if (dnum == 0) {
            str = "0";
        } else {
            while (dnum > 0) {
                long r = dnum % 16;

                if (r >= 10 && r <= 15) {
                    str = (char) ('A' + (r - 10)) + str;
                } else {
                    str = r + str;
                }
                dnum /= 16;
            }
        }
    }

    void Display() {
        System.out.println("The number in hexadecimal form: " + str);
    }
}
