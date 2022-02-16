package optional_task_one;

public class OptionalTask3 {
    public static void main(String[] args) {
        int array[] = {12345, 1234, 123, 12, 1};
        int count = 0;
        int sum = 0;
        int avgAmountOfChars = 0;
        int tmpArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int figureAmount = array[i];
            while (figureAmount > 0) {
                figureAmount /= 10;
                count++;
            }

            tmpArray[i] = count;
            count = 0;

            sum += tmpArray[i];

            avgAmountOfChars = sum / array.length;
        }

        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] > avgAmountOfChars) {
                System.out.println("In the diapason ( the numbers longer than average size) : " + array[i] + "; " + " It consists of : " + tmpArray[i] + " chars");
            } else if (tmpArray[i] < avgAmountOfChars) {
                System.out.println("In the diapason ( the numbers shorter than average size) : " + array[i] + "; " + " It consists of : " + tmpArray[i] + " chars");
            }
        }
    }
}
