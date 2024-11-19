import java.util.Scanner;
public class array {
    
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int array[][]=new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                array[i][j]=sc.nextInt();
            }
            System.out.println();

        }

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+ " ");

            }
            System.out.println();

        }

    }

}
