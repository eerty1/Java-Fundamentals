package main_task;

import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int prod = 1;

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Enter the numbers you want to fill the array with: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }



        for (int i = 0; i < array.length; i++) {

            sum += array[i];
            prod *= array[i];

        }
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The production of the numbers is: " + prod);
    }
}
