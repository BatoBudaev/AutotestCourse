package Average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало диапазона:");
        int startNumber = scanner.nextInt();
        System.out.println("Введите конец диапазона:");
        int endNumber = scanner.nextInt();

        int sum = 0;
        int count = 0;
        int evenNumbersCount = 0;
        int evenNumbersSum = 0;

        while (startNumber <= endNumber) {
            sum += startNumber;
            count++;

            if (startNumber % 2 == 0) {
                evenNumbersSum += startNumber;
                evenNumbersCount++;
            }

            startNumber++;
        }

        double average = (double) sum / count;
        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;

        System.out.printf("Среднее арифметическое = %.2f%n", average);
        System.out.printf("Среднее арифметическое четных чисел = %.2f", evenNumbersAverage);
    }
}
