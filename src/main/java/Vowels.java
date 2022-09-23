package src.main.java;


import java.util.Arrays;
import java.util.List;

/**
 * Return the number (count) of vowels in the given string.
 * <p>
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 * <p>
 * The input string will only consist of lower case letters and/or spaces.
 **/

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'u', 'o');
        for (char c : str.toCharArray()) {
            if (vowels.contains(c))
                vowelsCount++;
        }
        return vowelsCount;
    }
}
