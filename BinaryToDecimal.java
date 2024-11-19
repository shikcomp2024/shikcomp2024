import java.util.Scanner;

public class BinaryToDecimal {
    Scanner sc = new Scanner(System.in);

    int input;
    int total;

    BinaryToDecimal() {
        input = 0;
        total = 0;
    }

    void input() {
        System.out.println("Enter the binary number:");
        input = sc.nextInt();
    }

    void convert() {
        int remainder = 0;
        int n = 1;
        int power = 0;

        while (input != 0) {
            remainder = input % 10;
            power = remainder * n;
            total = total + power;
            n = n * 2;
            input = input / 10;
        }
    }

    void print() {
        System.out.print(total);
    }

    public static void main(String[] args) {
        BinaryToDecimal ob = new BinaryToDecimal();
        ob.input();
        ob.convert();
        ob.print();
    }
}
