package optional_task_one;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");

        int size = scanner.nextInt();


        int array [];
        array = new int[size];


        System.out.println("Enter the numbers you want to fill the array with: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(array));


        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }


        System.out.println("The array after sorting is: " + Arrays.toString(array));
    }
}
