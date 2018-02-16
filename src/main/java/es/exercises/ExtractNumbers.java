package es.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question 1:
 Develop a function that will receive as input a text string formed by digits and letters that will return the unique numbers formed by the consecutive digits, ordered and without duplicates considering letters as numbers separators.

 Ex: "A56B455VB23GTY23J" -> {23, 56, 455}

 Note:
 1. The input string can be huge.

 Return a list with the numbers in ascending order.

 You may use the standard or base library included with the language of your choice. Your solution will be evaluated on correctness, runtime complexity (big-O), and adherence to coding best practices.
 A complete answer will include the following:
 1. List the language you’re using.
 2. Document your assumptions.
 3. Explain your approach and how you intend to solve the problem.
 4. Provide code comments where applicable.
 5. Explain the big-O run time complexity of your solution. Justify your answer.
 6. Identify any additional data structure you used and justify why you used them.
 */
public class ExtractNumbers {

    public static void main(String [] args) {

        String text1 = "A56B455VB23GTY23J";
        List<Integer> listNumbers = getNumbers(text1);

        // Print the result
        listNumbers.stream().forEach(System.out::println);

    }

    public static List<Integer> getNumbers(String text) {
        String[] splitted = text.replaceAll("[a-zA-Z]+",",").split(",");

        List<Integer> listNumbers = Arrays.stream(splitted)
                .filter(s -> !s.isEmpty())
                .map(a -> Integer.parseInt(a))
                .distinct()
                .sorted() //.sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        return listNumbers;
    }

}
