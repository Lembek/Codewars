package src.main.java;

/**
 * Count the number of divisors of a positive integer n.
 * <p>
 * Random tests go up to n = 500000.
 * <p>
 * Examples (input --> output)
 * 4 --> 3 (1, 2, 4)
 * 5 --> 2 (1, 5)
 * 12 --> 6 (1, 2, 3, 4, 6, 12)
 * 30 --> 8 (1, 2, 3, 5, 6, 10, 15, 30)
 **/

public class FindDivisor {

    public static long numberOfDivisors(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0)
                result++;
        }
        return result;
    }
}
