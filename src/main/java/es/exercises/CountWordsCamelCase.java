package es.exercises;

import java.util.stream.Collectors;

/**
 * Cuenta las palabras de un string en camel case
 */
public class CountWordsCamelCase {

    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        int result = camelcase2(s);
        System.out.println("Total words: " + result);
    }

    static int camelcase(String s) {
        int upperCase = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upperCase++;
            }
        }
        return ++upperCase;
    }

    static int camelcase2(String s) {
        int upperCase = (int) s.codePoints()
                .mapToObj(c -> (char) c)
                .filter(c -> c.isUpperCase(c))
                .count();
        return upperCase + 1;
    }



}
