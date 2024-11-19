import java.util.Scanner;
public class ReArrange {
    Scanner sc=new Scanner(System.in);

    String Txt;
    String Cxt;
    int len;

    ReArrange(){
        Txt=" ";
        Cxt=" ";
        len=0;
    }

    void readword(){
        System.out.println("enter the word");
        String input=sc.nextLine();
        Txt=input.toUpperCase();
        len=Txt.length();
    }

    void convert(){
        char ch1;
        int vowelPos=1;
        
        for(int i=0;i<len;i++){
            ch1=Txt.charAt(i);
            if(ch1=='A' ||ch1=='E' ||ch1=='I' ||ch1=='O' ||ch1=='U' ){
                vowelPos=i;
            }
        }
        
        int half=(int)(len/2);

        if(Txt.charAt(0)=='A'||Txt.charAt(0)=='E'||Txt.charAt(0)=='I'
            ||Txt.charAt(0)=='O'||Txt.charAt(0)=='U'){

            Cxt=Txt+"Y";
            }
            String S=" ";

            for(int i=1;i<len;i++){
                ch1=Txt.charAt(i);
                if(ch1=='A' ||ch1=='E' ||ch1=='I' ||ch1=='O' ||ch1=='U' ){
                    String temp=Txt.substring(0,i);
                    String temp2=Txt.substring(i,len);
                    S=temp2+temp;
                    Cxt=S+"C";
                    break;
                }
                else{
                    Cxt=Txt+"N";
                }
            
            }
    }

    void display(){
        System.out.println("origial word " + Txt);
        System.out.println("Rearranged word " + Cxt);
    }
    public static void main(String[] args) {
        ReArrange ob=new ReArrange();
        ob.readword();
        ob.convert();
        ob.display();
        
    }
}
