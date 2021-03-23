import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

//     Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder).

        Integer numbers[] = new Integer[]{2, -3, 1, 7, -11};
        int sum = 0;
        double average = 0;

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.print("Масив відсортований за спаданням:[ ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("];");

//        You get an array of numbers(should contain both positive and negative numbers),
//        and return the sum of all the positive ones.
//        (If there are nothing to sum, sum should be 0)

        for (int i : numbers) {
            if (i > 0)
                sum += i;
        }
        System.out.println("Сума всіх додатніх чисел = " + sum + ";");

//        You get an array of numbers, return the average of a list of numbers in this array.
//        (Example -  array{1,2,4,1} -> avg = 2)

        for (int i : numbers) {
            average += i;

        }
        System.out.println("Середнє арифметичне всіх чисел масиву = " + average / numbers.length + "; ");

//        *You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values by 0.
//        Result should be  next: {3,2,0,1,4,0,8,0}

        Integer[] replaceNum = {30, 80, 30, 10, 40, 10, 80, 30};
        for (int i =0; i< replaceNum.length; i++) {
            for (int j = i + 1; j < replaceNum.length; j++) {

                if (replaceNum[i].equals(replaceNum[j])) {

                    replaceNum[j] = 0;

                }

            }

        }
        System.out.print("В масиві було замінено всі дубльовані значення на 0: " + Arrays.toString(replaceNum));
    }
}