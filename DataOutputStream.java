import java.io.*;
public class DataOutputStream {
     public static void main(String args[])throws IOException{
    byte array[]={'A','G','A','S','T','H','Y','A'};
    FileOutputStream fout=null;
    fout=new FileOutputStream("Agu.txt");
    fout.write(array);
    fout.close();}
    
}
