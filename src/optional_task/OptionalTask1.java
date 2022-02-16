package optional_task;

//EN task
//Find the longest and the shortest number.
//Output the length.

//RU task
//Найти самое короткое и самое длинное число.
// Вывести найденные числа и их длину.

public class OptionalTask1 {
    public static void main(String[] args) {
        int array[] = {12345, 123, 12, 123456, 1234};
        int count = 0;
        int min = array[0];
        int max = 0;


        int temporaryArray [] = new int[array.length];


        for (int i = 0; i < array.length; i++) {
            int figure = array[i];

            while (figure > 0) {
                figure /= 10;
                count++;
            }

            temporaryArray [i] = count;
            count = 0;




            if (array [i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        int minAmount = temporaryArray[0];
        int maxAmount = 0;

        for (int j = 0; j < temporaryArray.length; j++) {
            if (temporaryArray [j] > maxAmount) {
                maxAmount = temporaryArray[j];
            } else if (temporaryArray[j] < minAmount) {
                minAmount = temporaryArray[j];
            }
        }

        System.out.println("The longest is: " + max + ", the length is = " + maxAmount);
        System.out.println("The shortest is: " + min + ", the length is  = " + minAmount);

    }
}