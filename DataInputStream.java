import java.io.*;
public class DataInputStream {
    public static void main(String args[])throws IOException{
        FileInputStream fin=null;
        int a ;
        System.out.println("the input from the text file  ");
        fin=new FileInputStream("ABC.txt");
        
        while(((a=fin.read())!=-1)){
            System.out.print((char)a);
        }
        fin.close();
    }
    
}
