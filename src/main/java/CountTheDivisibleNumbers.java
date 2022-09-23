package src.main.java;


/**
 * Complete the function that takes 3 numbers x, y and k (where x ≤ y), and returns the number of integers within the range [x..y] (both ends included) that are divisible by k.
 * <p>
 * More scientifically: { i : x ≤ i ≤ y, i mod k = 0 }
 * <p>
 * Example
 * Given x = 6, y = 11, k = 2 the function should return 3, because there are three numbers divisible by 2 between 6 and 11: 6, 8, 10
 * <p>
 * Note: The test cases are very large. You will need a O(log n) solution or better to pass. (A constant time solution is possible.)
 **/
public class CountTheDivisibleNumbers {

    public static long divisibleCount(long x, long y, long k) {
        return (x == 0) ? y / k + 1 : y / k - (x - 1) / k;
    }
}
