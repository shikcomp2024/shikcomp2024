import java.util.Scanner;

public class RecursionDigitExtraction {

    public void extract(int a) {
        if (a == 0) {
            return;
        } else {
            int rem = a % 10;
            System.out.println(rem);
            extract(a / 10);
        }  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int input = sc.nextInt();

        RecursionDigitExtraction ob = new RecursionDigitExtraction();
        ob.extract(input);
    }
}
