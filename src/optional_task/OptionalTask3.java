package optional_task;

//EN task
//Output to the console thу numbers whose length is less than (greater than) the average length for all numbers.
//Also output their length.

//RU task
//Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

public class OptionalTask3 {
    public static void main(String[] args) {
        int array[] = {12345, 1234, 123, 12, 1};
        int count = 0;
        int sum = 0;
        int avgAmountOfChars = 0;
        int temporaryArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int figureAmount = array[i];
            while (figureAmount > 0) {
                figureAmount /= 10;
                count++;
            }

            temporaryArray[i] = count;
            count = 0;

            sum += temporaryArray[i];

            avgAmountOfChars = sum / array.length;
        }

        for (int i = 0; i < temporaryArray.length; i++) {
            if (temporaryArray[i] > avgAmountOfChars) {
                System.out.println("In the diapason ( the numbers longer than average size) : " + array[i] + "; " + " It consists of : " + temporaryArray[i] + " chars");
            } else if (temporaryArray[i] < avgAmountOfChars) {
                System.out.println("In the diapason ( the numbers shorter than average size) : " + array[i] + "; " + " It consists of : " + temporaryArray[i] + " chars");
            }
        }
    }
}
