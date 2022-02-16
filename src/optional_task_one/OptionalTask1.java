package optional_task_one;

public class OptionalTask1 {
    public static void main(String[] args) {
        int array[] = {12345, 123, 12, 123456, 1234};
        int counter = 0;
        int min = array[0];
        int max = 0;


        int tmpArray [] = new int[array.length];


        for (int i = 0; i < array.length; i++) {
            int figure = array[i];

            while (figure > 0) {
                figure /= 10;
                counter++;
            }

            tmpArray [i] = counter;
            counter = 0;


            if (array [i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        int minAmount = tmpArray[0];
        int maxAmount = 0;

        for (int j = 0; j < tmpArray.length; j++) {
            if (tmpArray [j] > maxAmount) {
                maxAmount = tmpArray[j];
            } else if (tmpArray[j] < minAmount) {
                minAmount = tmpArray[j];
            }
        }

        System.out.println("The longest number is: " + max + ", the length is = " + maxAmount);
        System.out.println("The shortest number is: " + min + ", the length is  = " + minAmount);

    }
}