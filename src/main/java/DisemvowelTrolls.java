package src.main.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Trolls are attacking your comment section!
 * <p>
 * A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
 * <p>
 * Your task is to write a function that takes a string and return a new string with all vowels removed.
 * <p>
 * For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
 * <p>
 * Note: for this kata y isn't considered a vowel.
 **/


public class DisemvowelTrolls {
    public static final List<String> vowels = Arrays.asList("a", "i", "o", "e", "u", "A", "E", "U", "I", "O");

    public static String disemvowel(String str) {
        return Arrays.stream(str.split(""))
                .filter((s) -> !vowels.contains(s))
                .collect(Collectors.joining());
    }
}
