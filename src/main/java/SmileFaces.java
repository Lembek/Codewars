package src.main.java;

import java.util.List;

/**
 * Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
 * <p>
 * Rules for a smiling face:
 * <p>
 * Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
 * A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
 * Every smiling face must have a smiling mouth that should be marked with either ) or D
 * No additional characters are allowed except for those mentioned.
 * <p>
 * Valid smiley face examples: :) :D ;-D :~)
 * Invalid smiley faces: ;( :> :} :]
 * <p>
 * Example
 * countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
 * countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
 * countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
 * Note
 * In case of an empty array return 0. You will not be tested with invalid input (input will always be an array).
 * Order of the face (eyes, nose, mouth) elements will always be the same.
 **/

public class SmileFaces {

    public static long countSmileys(List<String> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        return arr.stream()
                .filter((s) -> {
                    boolean a = s.charAt(0) == ';' || s.charAt(0) == ':';
                    if (s.length() == 2) {
                        boolean b = s.charAt(1) == ')' || s.charAt(1) == 'D';
                        return a && b;
                    }
                    if (s.length() == 3) {
                        boolean c = s.charAt(1) == '-' || s.charAt(1) == '~';
                        boolean d = s.charAt(2) == ')' || s.charAt(2) == 'D';
                        return a && c && d;
                    }
                    return false;
                })
                .count();
    }
}
