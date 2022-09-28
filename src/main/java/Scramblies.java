package src.main.java;

/**
 * Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
 * <p>
 * Notes:
 * <p>
 * Only lower case letters will be used (a-z). No punctuation or digits will be included.
 * Performance needs to be considered.
 * Examples
 * scramble('rkqodlw', 'world') ==> True
 * scramble('cedewaraaossoqqyt', 'codewars') ==> True
 * scramble('katas', 'steak') ==> False
 **/

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        int oldLength = str1.length();
        for (String s : str2.split("")) {
            str1 = str1.replaceFirst(s, "");
        }
        return oldLength - str2.length() == str1.length();
    }
}
