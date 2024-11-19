import java.util.Scanner;
public class TheFrequency {
    Scanner sc=new Scanner(System.in);

    String input;
    String CapitalInput;
    int TheCounter;    
    String array[]=new String[10];


    TheFrequency(){
        input=" ";
        CapitalInput= " ";
        TheCounter=0;
    }

    void input(){
        System.out.println("enter the word");
        input=sc.nextLine();
    }

    void Uppercase(){
        CapitalInput=input.toUpperCase();
    }

    void frequency(){
        
        array=CapitalInput.split(" ");
            for(int i=0;i<array.length;i++){
                if(array[i].equals("THE")){
                    TheCounter++;
                }
            }
    }

    void print(){
        System.out.println("The counter " + TheCounter);

    }

    public static void main(String[] args) {
        TheFrequency ob=new TheFrequency();
        ob.input();
        ob.Uppercase();
        ob.frequency();
        ob.print();
        
    }
}
