package main_task;

import java.util.Random;


public class MainTask3 {
    public static void main(String[] args) {

        Random random = new Random();
        int array [] = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }


        System.out.println("The array output with and without transition to a new line: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.print(array[i] + " ");
        }
    }
}



