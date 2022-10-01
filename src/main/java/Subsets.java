package main.java;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Given a set of elements (integers or string characters, characters only in RISC-V) that may occur more than once,
 * we need to know the amount of subsets that none of their values have repetitions.
 * <p>
 * Let's see with an example:
 * <p>
 * set numbers = {1, 2, 3, 4}
 * The subsets are:
 * <p>
 * {{1}, {2}, {3}, {4}, {1,2}, {1,3}, {1,4}, {2,3}, {2,4},{3,4}, {1,2,3}, {1,2,4}, {1,3,4}, {2,3,4}, {1,2,3,4}}
 * (15 subsets, as you can see the empty set, {}, is not counted)
 * Let's see an example with repetitions of an element:
 * <p>
 * set letters= {a, b, c, d, d}
 * The subsets for this case will be:
 * <p>
 * {{a}, {b}, {c}, {d}, {a,b}, {a,c}, {a,d}, {b,c}, {b,d},{c,d}, {a,b,c}, {a,b,d}, {a,c,d}, {b,c,d}, {a,b,c,d}}
 * (15 subsets, only the ones that have no repeated elements inside)
 * The function est_subsets() (javascript: estSubsets()) will calculate the number of these subsets.
 * <p>
 * It will receive the array as an argument and according to its features will output the amount of different subsets
 * without repetitions of its elements.
 * <p>
 * est_subsets([1, 2, 3, 4]) == 15
 * est_subsets(['a', 'b', 'c', 'd', 'd']) == 15
 * Features of the random tests:
 * <p>
 * Low Performance Tests: 40
 * Length of the arrays between 6 and 15
 * <p>
 * High Performance Tests: 80
 * Length of the arrays between 15 and 100 (Python and Ruby) and between 15 and 50 in javascript and Lua
 * Just do it!
 **/

public class Subsets {

    public static <T> long count(T[] elems) {
        if (elems == null || elems.length == 0) {
            return 0;
        }
        Set<T> set = Arrays.stream(elems).collect(Collectors.toSet());
        long[] dp = new long[set.size() + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + (2L << (i - 2));
        }
        return dp[set.size()];
    }
}
