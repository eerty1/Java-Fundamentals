package main_task;

import java.util.Scanner;

public class MainTask1 {

    public static void main(String[] args) {

        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the user name you want to login with: ");

        name = scanner.nextLine();

        System.out.println("Hello, " + name);
    }
}
