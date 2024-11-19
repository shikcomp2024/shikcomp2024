import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchRecursion {
    Scanner sc = new Scanner(System.in);

    int array[];
    int search;

    LinearSearchRecursion() {
        array = new int[10];
    }

    void input() {
        System.out.println("enter the input");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("enter the number you want to search");
        search = sc.nextInt();
        Arrays.sort(array);
    }

    int linearsearch(int a) {
        if (a >= array.length) {
            System.out.println("number not found");
            return-1;
        }
        if (array[a] == search) {
            System.out.println("number found at " + (a + 1));
            return a + 1;
        }
        return linearsearch(a + 1);
    }

    public static void main(String[] args) {
        LinearSearchRecursion ob = new LinearSearchRecursion();
        ob.input();
        ob.linearsearch(0);
    }
}
