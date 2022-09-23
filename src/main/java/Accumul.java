package src.main.java;

/**
 * This time no story, no theory. The examples below show you how to write function accum:
 * <p>
 * Examples:
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 **/

public class Accumul {

    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.toLowerCase().split("");
        for (int i = 0; i < s.length(); i++) {
            sb.append(split[i].toUpperCase());
            sb.append(split[i].repeat(i));
            sb.append("-");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

}
