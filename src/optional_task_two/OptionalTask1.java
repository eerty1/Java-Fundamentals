package optional_task_two;


import java.util.Random;
import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of the rows in the matrix: ");
        int row = scanner.nextInt();


        System.out.println("Enter the amount of the columns in the matrix: ");
        int column = scanner.nextInt();

        int matrix[][] = new int[row][column];

        Random random = new Random();


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt();
            }
        }
        System.out.println("The matrix is: " + " \n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j - 1] > matrix[i][j]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][j - 1];
                        matrix[i][j - 1] = temp;
                        isSorted = false;
                    }
                }
            }
        }

        System.out.println(" \n" + "The matrix after sorting is: " + " \n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}