import java.util.*;
public class ReverseRecursion {

    int reverse(int i){
        int c=0;
        if (i==0){
            return 0;
        }
        else{
            int b=i%10;
            reverse(i/10);
            return(c*10+b);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int input=sc.nextInt();
        ReverseRecursion ob=new ReverseRecursion();
        System.out.println(ob.reverse(input));
        
    }
}
