package src.main.java;

/**
 * Digital root is the recursive sum of all the digits in a number.
 * <p>
 * Given n, take the sum of the digits of n. If that value has more than one digit,
 * continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
 * <p>
 * Examples
 * 16  -->  1 + 6 = 7
 * 942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
 * 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->
 **/

public class DRoot {

    public static int digital_root(int n) {
        String[] digits = Integer.toString(n).split("");
        int result = 0;
        for (String s : digits) {
            result += Integer.parseInt(s);
        }
        if (result > 9)
            return digital_root(result);
        return result;
    }
}
