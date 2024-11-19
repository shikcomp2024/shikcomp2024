import java.util.Scanner;
public class DecimalToBinaryFractional {
    Scanner sc=new Scanner(System.in);

    String input;
    int intpart;
    double decimal;
    String converted;

    DecimalToBinaryFractional(){
        input=" ";
        intpart=0;
        decimal=0.0;
        converted=" ";}
    
    void input(){ 
        System.out.println("enter the number");
        input=sc.next();}

    void spilt(){

        String str1=input.substring(0, input.indexOf('.')); 
        intpart=Integer.parseInt(str1); 

        String str2 = input.substring(input.indexOf('.'));
        decimal = Double.parseDouble(str2);}

    void convert(){
        int remainder=0;
        String integerpart=" ";
        double d=0.0;
        int a=0;
        double b=0;
        String fractionalpart=" ";
        int ctr=0;
            

        while(intpart!=0){
            remainder=intpart%2;
            integerpart=remainder+integerpart;
            intpart/=2;}

        integerpart=integerpart+'.';
            

        while(ctr<=7)
        {d=decimal*2;
            a=(int)d;
            fractionalpart=fractionalpart+a;
            b=d-a;
            decimal=b;
            ctr++;}
            
        converted=integerpart+fractionalpart;}

    void print(){
        System.out.println(converted);}

public static void main(String[] args) {
    DecimalToBinaryFractional ob=new DecimalToBinaryFractional();
        ob.input();
        ob.spilt();        
        ob.convert();
        ob.print();
    }
}
