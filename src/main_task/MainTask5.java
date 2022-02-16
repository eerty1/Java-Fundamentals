package main_task;

import java.util.Scanner;

public class MainTask5 {
    public static void main(String[] args) {
        String array [] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the month you want to get: ");
        int monthNumber = scanner.nextInt();

        String month = null;

        if(monthNumber > 12 || monthNumber < 1 ) {
            System.out.println("You've entered the wrong number, 1 - 12 expected");
        } else {
            for (int i = 0; i < monthNumber; i++) {
                month = array[i];
            }
            System.out.println("The month is: " + month);
        }
    }
}
