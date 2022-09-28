package src.main.java;

/**
 * Implement a function that receives two IPv4 addresses, and returns the number of addresses between them
 * (including the first one, excluding the last one).
 * <p>
 * All inputs will be valid IPv4 addresses in the form of strings.
 * The last address will always be greater than the first one.
 * <p>
 * Examples
 * With input "10.0.0.0", "10.0.0.50"  => return   50
 * With input "10.0.0.0", "10.0.1.0"   => return  256
 * With input "20.0.0.10", "20.0.1.0"  => return  246
 **/

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        String[] startSplit = start.split("\\.");
        String[] endSplit = end.split("\\.");

        long result = 0;

        for (int i = 0; i < startSplit.length; i++) {
            result += (Long.parseLong(endSplit[i]) - Long.parseLong(startSplit[i]))
                    * (Math.pow(2.0, 24 - i * 8));
        }

        return result;
    }
}
