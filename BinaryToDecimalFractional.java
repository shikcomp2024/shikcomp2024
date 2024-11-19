import java.util.Scanner;
public class BinaryToDecimalFractional {
    Scanner sc=new Scanner(System.in);
    String input;
    int intpart;
    int decimal;
    String converted;
    String str1;
    String str2;

    BinaryToDecimalFractional(){
        input=" ";
        intpart=0;
        decimal=0;
        converted=" ";}
    
    void input(){
        System.out.println("enter the number");
        input=sc.next();}

    void spilt(){

        str1=input.substring(0, input.indexOf('.'));
        intpart=Integer.parseInt(str1); 
       

        str2 = input.substring(input.indexOf('.')+1);
        decimal = Integer.parseInt(str2);}
        
        
    void convert() {
        int remainder1 = 0,n1 = 1,a = 0,sum1 = 0;
        double sum2 = 0,n2 = 0.5;
        
        while (intpart != 0) {
            remainder1 = intpart % 10;
            a = remainder1 * n1;
            sum1 = sum1 + a;
            intpart /= 10;
            n1 = n1 * 2;}
        
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            int binaryNo = ch - '0';
            sum2 += binaryNo * n2;
            n2 *= 0.5;}
        
            converted = String.valueOf(sum1 + sum2);
        }
        

    void print(){
       System.out.println(converted);
    }

    public static void main(String[] args) {
       BinaryToDecimalFractional ob=new BinaryToDecimalFractional();
        ob.input();
        ob.spilt();        
        ob.convert();
        ob.print();
        
    }
}
