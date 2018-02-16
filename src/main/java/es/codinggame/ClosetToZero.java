package es.codinggame;

import java.util.Arrays;

/**
 * Write a program that prints the temperature closest to 0 among input data.
 * If two numbers are equally close to zero, positive integer has to be considered closest to zero (for instance, if the temperatures are -5 and 5, then display 5).
 *
 * https://www.codingame.com/ide/puzzle/temperatures
 *
 */
public class ClosetToZero {

    public static void main(String [] args) {
        String numbers = "4 2";
        System.out.println("Case 1: " + getResult(numbers));

        numbers = "2 1 -1";
        System.out.println("Case 2: " + getResult(numbers));

        numbers = "5 1 -2 3 2 -4";
        System.out.println("Case 3: " + getResult(numbers));

        numbers = "";
        System.out.println("Case 4: " + getResult(numbers));
    }

    private static int getResult(String numbers) {
        int result = numbers.length() == 0 ? 0 : Arrays.stream(numbers.split(" "))
                .map(a -> Integer.parseInt(a))
                .sorted((a,b) -> Math.abs(a) != Math.abs(b) ? Math.abs(a) - Math.abs(b) : b - a)
                .iterator().next();
        return result;
    }
}
