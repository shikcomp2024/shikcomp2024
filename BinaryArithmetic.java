import java.util.Scanner;

public class BinaryArithmetic {
    Scanner sc = new Scanner(System.in);
    
    String bin1;
    String bin2;
    int choice;
    String result;
    
    BinaryArithmetic() {
        bin1 = "";
        bin2 = ""; 
        choice = 0;
        result = "";
    }
    
    void input() {
        System.out.print("Enter first binary number: ");
        bin1 = sc.nextLine();
        
        System.out.print("Enter second binary number: ");
        bin2 = sc.nextLine();
        
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");
        choice = sc.nextInt();
    }
    
    int binaryToInt(String binary) {
        int number = 0;
        int base = 1; // 2^0
        
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                number += base;
            }
            base = base * 2;
        }
        
        return number;
    }
    
    String intToBinary(int number) {
        if (number == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        
        while (number > 0) {
            int remainder = number % 2;
            binary.append(remainder);
            number = number / 2;
        }
        
        return binary.reverse().toString();
    }
    
    void binaryAddition() {
        int num1 = binaryToInt(bin1);
        int num2 = binaryToInt(bin2);
        int sum = num1 + num2;
        result = intToBinary(sum);
    }
    
    void binarySubtraction() {
        int num1 = binaryToInt(bin1);
        int num2 = binaryToInt(bin2);
        int difference = num1 - num2;
        result = intToBinary(difference);
    }
    
    void binaryMultiplication() {
        int num1 = binaryToInt(bin1);
        int num2 = binaryToInt(bin2);
        int product = num1 * num2;
        result = intToBinary(product);
    }
    
    void binaryDivision() {
        int num1 = binaryToInt(bin1);
        int num2 = binaryToInt(bin2);
        if (num2 == 0) {
            result = "Error: Division by zero";
        } else {
            int quotient = num1 / num2;
            result = intToBinary(quotient);
        }
    }
    
    void performOperation() {
        switch (choice) {
            case 1:
                binaryAddition();
                break;
            case 2:
                binarySubtraction();
                break;
            case 3:
                binaryMultiplication();
                break;
            case 4:
                binaryDivision();
                break;
            default:
                result = "Invalid choice!";
                break;
        }
    }
    
    void print() {
        System.out.println("Result: " + result);
    }
    
    public static void main(String[] args) {
        BinaryArithmetic ob = new BinaryArithmetic();
        ob.input();
        ob.performOperation();
        ob.print();
    }
}
