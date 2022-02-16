package optional_task_two;


import java.util.Random;
import java.util.Scanner;

public class OptionalTask3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of the rows in the matrix: ");
        int row = scanner.nextInt();


        System.out.println("Enter the amount of the columns in the matrix: ");
        int column = scanner.nextInt();

        long matrix[][] = new long[row][column];

        long firstElement = 0;
        int positionFirstElement = 0;
        long secondElement = 0;
        int positionSecondElement = 0;
        long sum = 0;


        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    if (firstElement == 0) {
                        positionFirstElement = j;
                        firstElement = matrix[i][j];
                    } else if (secondElement == 0) {
                        positionSecondElement = j;
                        secondElement = matrix[i][j];

                    } else break;
                }
            }
            if (firstElement != 0 && secondElement != 0 ) {
                for (int j = positionFirstElement+1; j < positionSecondElement; j++) {
                    sum += matrix[i][j];
                }
                System.out.println("The sum of the elements in the " + i + "row is: " + sum);
                sum = 0;
                firstElement = 0;
                secondElement = 0;
                positionFirstElement = 0;
                positionSecondElement = 0;
            }
        }
    }
}