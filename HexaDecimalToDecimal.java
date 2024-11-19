import java.util.Scanner;

public class HexaDecimalToDecimal {
    Scanner sc = new Scanner(System.in);
    int input;
    int remainder;
    String converted;
    int total;
    int power;

    HexaDecimalToDecimal() {
        input = 0;
        remainder = 0;
        converted = "";
        total=0;
        power=0;
    }

    void input() {
        System.out.println("Enter the number");
        input = sc.nextInt();
    }

    void convert(){
        int n=1;
        while(input!=0){
            remainder=input%10;
            power=remainder*n;
            total=total+power;
            n=n*16;
            input=input/10;
        }
    }
    void print(){
        System.out.println(total);
    }
    public static void main(String[] args) {
        HexaDecimalToDecimal ob=new HexaDecimalToDecimal();
        ob.input();
        ob.convert();
        ob.print();
    }
}
