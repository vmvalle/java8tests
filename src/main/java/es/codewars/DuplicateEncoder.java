package es.codewars;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The goal of this exercise is to convert a string to a new string where each character in the new string is '('
 * if that character appears only once in the original string, or ')'
 * if that character appears more than once in the original string.
 * Ignore capitalization when determining if a character is a duplicate.
 *
 * Examples:
 * "din" => "((("
 * "recede" => "()()()"
 * "Success" => ")())())"
 * "(( @" => "))(("
 */
public class DuplicateEncoder {

    static String encodeUsingStreams(String word){
        return word.toLowerCase()
                .chars()
                .mapToObj(i -> String.valueOf((char)i))
                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                .collect(Collectors.joining());
    }

    static String encode(String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }

}
