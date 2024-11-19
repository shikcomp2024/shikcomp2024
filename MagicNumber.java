import java.util.Scanner;

public class MagicNumber {

    int n;

    MagicNumber() {
        n = 0;
    }

    void getnum(int nn) {
        n = nn;
    }

    private int Sum_of_digits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    void isMagic() {
        int num = n;
        while (num >= 10) {
            num = Sum_of_digits(num);
        }
        if (num == 1) {
            System.out.println("The number is a magic number.");
        } else {
            System.out.println("The number is not a magic number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int nn = sc.nextInt();

        MagicNumber ob = new MagicNumber();
        ob.getnum(nn);
        ob.isMagic();
        
        sc.close();
    }
}
