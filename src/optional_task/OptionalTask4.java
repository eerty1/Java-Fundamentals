package optional_task;

import java.util.ArrayList;

//EN task
//Find the amount of numbers containing only even digits.
//And among the remaining ones - the amount of numbers with an equal amount of even and odd digits.

//RU task
//Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.

public class OptionalTask4 {
    public static void main(String[] args) {
        int array[] = {123, 12345, 1234, 1212, 2424, 5656, 8888};
        int even = 0;
        int odd = 0;
        int evenFinal = 0;
        int oddEvenFinal = 0;


        for (int i = 0; i < array.length; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (array[i] != 0) {
                arrayList.add(array[i] % 10);
                array[i] /= 10;
            }

            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(j) % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            if (even == arrayList.size()) {
                evenFinal++;
            } else if (even == odd) {
                oddEvenFinal++;
            }
            even = 0;
            odd = 0;
        }
        System.out.println("The amount of numbers which consist of even figures: " + evenFinal);
        System.out.println("The amount of numbers which consist of odd and even figures: " + oddEvenFinal);
    }
}
