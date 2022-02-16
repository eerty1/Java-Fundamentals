package optional_task_one;

import java.util.ArrayList;

public class OptionalTask5 {
    public static void main(String[] args) {
        int array[] = {123, 12345, 1234, 1212, 2424, 5656, 8888};
        int even = 0;
        int odd = 0;
        int evenFinal = 0;
        int oddFinal = 0;


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
                oddFinal++;
            }
            even = 0;
            odd = 0;
        }
        System.out.println("The amount of numbers which consist of even figures: " + evenFinal);
        System.out.println("The amount of numbers which consist of odd and even figures: " + oddFinal);
    }
}
