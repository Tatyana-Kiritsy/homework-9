import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrayMonth = {10347, 2346, 12360, 346, 5985};
        int sum = 0;
        for (int monthSum : arrayMonth) {
            sum += monthSum;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();
        int maxSum = -1;
        int minSum = 1000_000;
        for (int i = 0; i < arrayMonth.length; i++) {
            if (arrayMonth[i] > maxSum) {
                maxSum = arrayMonth[i];
            }
            if (arrayMonth[i] < minSum) {
                minSum = arrayMonth[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSum +
                " рублей. Максимальная сумма трат за неделю составила " + maxSum + " рублей.");
        System.out.println();
        double averageSum = (double) sum / arrayMonth.length;
        for (int monthSum : arrayMonth) {
            sum += monthSum;
        }
        System.out.println(averageSum);
        System.out.println();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}

