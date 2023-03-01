package NumberDigits;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = Math.abs(scanner.nextInt());

        int digitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        while (number != 0) {
            int digit = number % 10;
            digitsSum += digit;

            if (digit % 2 != 0) {
                oddDigitsSum += digit;
            }

            if (digit > maxDigit) {
                maxDigit = digit;
            }

            number /= 10;
        }

        System.out.printf("Сумма цифр = %d%n", digitsSum);
        System.out.printf("Сумма нечетных цифр = %d%n", oddDigitsSum);
        System.out.printf("Максимальная цифра = %d%n", maxDigit);
    }
}
