package main_task;

import java.util.Scanner;

public class MainTask2 {


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

        System.out.println("The reverse order of the numbers in the array is: ");

        for (int i = array.length - 1; i >=  0; i--) {
            System.out.println(array[i]);
        }





    }
}
