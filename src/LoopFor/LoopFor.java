package LoopFor;

public class LoopFor {
    public static void main(String[] args) {
        for (int i = 100; i > 1; i--) {
            if (isMultipleOfFour(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static boolean isMultipleOfFour(int number) {
        return number % 4 == 0;
    }
}
