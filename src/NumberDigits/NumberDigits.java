package NumberDigits;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = Math.abs(scanner.nextInt());

        int digitsCount = 1;
        int numberForDigitsCount = number;

        while (numberForDigitsCount / 10 >= 1) {
            numberForDigitsCount /= 10;
            digitsCount++;
        }

        int i = 1;
        int digitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        while (i <= digitsCount) {
            int digit = (number / (int) Math.pow(10, i - 1)) % 10;
            digitsSum += digit;

            if (digit % 2 != 0) {
                oddDigitsSum += digit;
            }

            if (digit > maxDigit) {
                maxDigit = digit;
            }

            i++;
        }

        System.out.printf("Сумма цифр = %d%n", digitsSum);
        System.out.printf("Сумма нечетных цифр = %d%n", oddDigitsSum);
        System.out.printf("Максимальная цифра = %d", maxDigit);
    }
}
