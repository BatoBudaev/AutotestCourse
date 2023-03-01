package Average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало и конец диапазона:");

        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();
        int i = startNumber;
        int sum = 0;
        int count = 0;
        int evenNumbersCount = 0;
        int evenNumbersSum = 0;

        while (i <= endNumber) {
            sum += i;
            count++;

            if (i % 2 == 0) {
                evenNumbersSum += i;
                evenNumbersCount++;
            }

            i++;
        }

        double average = (double) sum / count;
        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;

        System.out.printf("Среднее арифметическое = %.2f%n", average);
        System.out.printf("Среднее арифметическое четных чисел = %.2f", evenNumbersAverage);
    }
}
