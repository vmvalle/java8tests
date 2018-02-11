package es.codinggame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a program which, using a given number of strengths,
 * identifies the two closest strengths and shows their difference with an integer (≥ 0).
 *
 * Game: Horse-racing Duals
 *
 * https://www.codingame.com/ide/puzzle/horse-racing-duals
 *
 */
public class MinorDifference {

    public static void main(String [] args) {
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(4);
        listNumbers.add(16);
        listNumbers.add(6);
        listNumbers.add(12);

        System.out.println("List of numbers: " + listNumbers);

        System.out.println("Minor difference: " + getMinDifference(listNumbers));
    }

    public static int getMinDifference(List<Integer> listNumbers) {

        Collections.sort(listNumbers);
        System.out.println("List after sorting: " + listNumbers);

        int value = Integer.MAX_VALUE;

        for (int i = 0; i < listNumbers.size() - 1; i++) {
            int current = listNumbers.get(i);
            int next = listNumbers.get(i + 1);
            int diff = next - current;
            if ( diff < value) {
                value = diff;
            }
        }

        return value;
    }
}
