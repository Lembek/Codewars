package src.main.java;

/**
 * Your task is to sort a given string. Each word in the string will contain a single number.
 * This number is the position the word should have in the result.
 * <p>
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * <p>
 * If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 * <p>
 * Examples
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 * ""  -->  ""
 **/

public class Order {

    public static String order(String words) {
        if (words.isEmpty())
            return "";
        String[] strings = words.split(" ");
        String[] result = new String[strings.length];
        for (String s : strings) {
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    result[Integer.parseInt(Character.toString(c)) - 1] = s;
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str : result) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
