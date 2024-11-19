import java.util.Arrays;
import java.util.Scanner;

public class BubblesortRecursion {
    Scanner sc = new Scanner(System.in);
    int array[];

    BubblesortRecursion() {
        array = new int[10];  }

    void input() {
        System.out.println("Enter the input:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }  }

    int[] bubbleSortRecursive(int n, int i) {
        if (n == 1) {
            return array;
        }
        if (i < n - 1) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
            return bubbleSortRecursive(n, i + 1);
        } else {
            return bubbleSortRecursive(n - 1, 0);
        }  }

    int[] bubbleSort(int n) {
        return bubbleSortRecursive(n, 0);  }

    int[] display() {
        return array;  }

    public static void main(String[] args) {
        BubblesortRecursion ob = new BubblesortRecursion();
        ob.input();
        ob.bubbleSort(ob.array.length);
        System.out.println("Sorted array: "+Arrays.toString(ob.display()));
    }  }
