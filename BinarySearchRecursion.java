import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursion {
    Scanner sc = new Scanner(System.in);
    int array[];
    int search;
    BinarySearchRecursion() {
        array = new int[10];
    }

    void input() {
        System.out.println("enter the input");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();        }
        System.out.println("enter the number you want to search");
        search = sc.nextInt();
        Arrays.sort(array);
    }

    int recursionBinarySearching(int l, int h) {
        int m = (l + h) / 2;
        if (l > h) {
            return 0;
        }

        if (array[m] == search) {
            System.out.println("number found at " + (m + 1));
            System.exit(0);
            return m + 1;
        } else if (array[m] < search) {
            return recursionBinarySearching(m + 1, h);
        } else {
            return recursionBinarySearching(l, m - 1);
        }    }

    public static void main(String[] args) {
        BinarySearchRecursion ob = new BinarySearchRecursion();
        ob.input();
        ob.recursionBinarySearching(0, ob.array.length - 1);
    }  }
