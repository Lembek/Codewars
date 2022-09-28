package src.main.java;

import java.util.HashMap;
import java.util.Map;

/**
 * At a job interview, you are challenged to write an algorithm to check if a given string, s,
 * can be formed from two other strings, part1 and part2.
 * <p>
 * The restriction is that the characters in part1 and part2 should be in the same order as in s.
 * <p>
 * The interviewer gives you the following example and tells you to figure out the rest from the given test cases.
 * <p>
 * For example:
 * <p>
 * 'codewars' is a merge from 'cdw' and 'oears':
 * <p>
 * s:  c o d e w a r s   = codewars
 * part1:  c   d   w         = cdw
 * part2:    o   e   a r s   = oears
 **/

public class MergedStringChecker {

    public static boolean isMerge(String s, String part1, String part2) {
        if (s.length() != part1.length() + part2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }

        return isValidPart(map, part1, s) && isValidPart(map, part2, s);
    }

    public static boolean isValidPart(Map<Character, Integer> map, String part, String s) {
        int count = 0;
        for (char c : part.toCharArray()) {
            count = s.indexOf(c, count);
            if (map.merge(c, -1, Integer::sum) < 0 || count == -1) {
                return false;
            }
        }
        return true;
    }
}
