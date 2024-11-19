
import java.util.Scanner;
public class Rot13 {

    Scanner sc = new Scanner(System.in);
    String Msg;
    String EncMsg;

    Rot13() {
        Msg = " ";
        EncMsg = " ";
    }

    void readMessage() {
        System.out.println("enter ");
        Msg = sc.nextLine();
        Msg = Msg.toUpperCase();
    }

    String RRot13(String s) {
        int ascii;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch;
            ch = s.charAt(i);
            ascii = ch + 13;
            if (ascii>90){
                ascii=ascii-26;
            }
            ch = (char) ascii;
            str = str + ch;
            
        }
        return str;

    }

    void Encrypt() {
        EncMsg=RRot13(Msg);
        
    } 

    void display() {
        System.out.println(EncMsg);
    }

    public static void main(String[] args) {

        Rot13 ob = new Rot13();
        ob.readMessage();
        ob.Encrypt();
        ob.display();

    }
}