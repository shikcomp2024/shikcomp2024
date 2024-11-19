import java.util.Scanner;
public class SumOfDigitsRecursion {
    
    int AB(int i){
        if(i<=0){
            return 0;
        }
        else{
            int b=i%10;
            return b +AB(i/10);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ");
        int a=sc.nextInt();
        SumOfDigitsRecursion ob=new SumOfDigitsRecursion();
        int sum=0;
        sum=sum+ ob.AB(a);
        System.out.print(sum);
    }
}
