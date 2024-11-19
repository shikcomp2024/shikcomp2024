import java.util.Scanner;

public class SpecialNumber {
    int n;
    int sum = 0;

    
    SpecialNumber() {
        n=0;
    }   
    
   
    void sum(int n) {
        int b;
        int temp = n; 
        sum = 0; 

        while (temp != 0) {
            b = temp % 10;
            int factorial = 1;

            for (int i = 1; i <= b; i++) {
                factorial *= i;
            }

            sum += factorial;
            temp /= 10;
        }
       
    }

    void isSpecial(int n) {
        if (n == sum) {
            System.out.println(n + " is a special number");
        } else {
            System.out.println(n + " is not a special number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        SpecialNumber ob = new SpecialNumber();
        ob.sum(n);
        ob.isSpecial(n);
    }
}
