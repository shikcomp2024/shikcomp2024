import java.util.Scanner;

public class HCFrecursion {

    int HCF(int a, int b, int i, int hcf) {
        if (i>a || i>b) {
            return hcf;
        } 
        if (a%i==0 && b%i==0) {
            hcf=i;
        }
        return HCF(a,b,i+1,hcf);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        HCFrecursion ob =new HCFrecursion();
        int result =ob.HCF(a, b, 1, 1);
        System.out.println( result);
    }
}


 /*for (int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                HCF=i;
            }
        }
        System.out.println(HCF);*/
