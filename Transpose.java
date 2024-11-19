import java.util.Scanner;
public class Transpose {
    Scanner sc = new Scanner(System.in);

    int arr[][];
    int m;

    Transpose(int mm) {
        m = mm;
        arr= new int[m][m]; }

    void fillarray() {
        System.out.println("enter the element ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <m; j++) {
                arr[i][j] = sc.nextInt();
            }  }  }

    void transpose() {
        System.out.println("The transpose array in matrix form:  ");
        for (int i = 0; i < m; i++) {
        for (int j = 0; j <m; j++) {
            System.out.print(arr[j][i] + " ");
            }
            System.out.println("");  }  }

    void display(){

        System.out.println("The orignal array in matrix form:  ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " "); }
            System.out.println();  }
        transpose();  }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        Transpose ob = new Transpose(size);
        ob.fillarray();
        ob.display();

    }  }
