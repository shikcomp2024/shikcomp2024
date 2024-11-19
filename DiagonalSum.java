import java.util.Scanner;

public class DiagonalSum {
    Scanner sc=new Scanner(System.in);
    
    int array[][]=new int[3][3];
    int sum1=0,sum2=0;
    
    void input(){
        System.out.println("enter the element ");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
            array[i][j]=sc.nextInt();
            }
        }
    }
    void print(){
        System.out.println("The array is : " );
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
    void diagonalsum(){
        for(int i=0;i<array.length;i++){
            sum1=sum1+array[i][i];}
        
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(i+j==2){
                    sum2=sum2+array[i][j];
                }
                    
            }
        }
        
        System.out.println( ( (sum1+sum2)-array[1][1]) );
        
    }

    public static void main (String args[]){
        DiagonalSum ob=new DiagonalSum();
        ob.input();
        ob.print();
        ob.diagonalsum();
    }

}
