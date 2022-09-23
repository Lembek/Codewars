package src.main.java;

/**
 * #Find the missing letter
 * <p>
 * Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
 * <p>
 * You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
 * The array will always contain letters in only one case.
 * <p>
 * Example:
 * <p>
 * ['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'
 * <p>
 * ["a","b","c","d","f"] -> "e"
 * ["O","Q","R","S"] -> "P"
 * (Use the English alphabet with 26 letters!)
 * <p>
 * Have fun coding it and please don't forget to vote and rank this kata! :-)
 * <p>
 * I have also created other katas. Take a look if you enjoyed this kata!
 **/

public class MissingLetter {

    public static char findMissingLetter(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if ((byte) array[i] + 1 != (byte) array[i + 1]) {
                return (char) (array[i] + 1);
            }
        }
        return ' ';
    }

}
