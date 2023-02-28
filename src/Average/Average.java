package Average;

public class Average {
    public static void main(String[] args) {
        int startNumber = 3;
        int endNumber = 18;
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
