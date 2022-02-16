package optional_task;

import java.util.Arrays;
import java.util.Scanner;

//EN task
//Output the range of numbers in ascending order.

//RU task
//Вывести числа в порядке возрастания значений их длины.

public class OptionalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();


        int array [];
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

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


        System.out.println(Arrays.toString(array));
    }
}
