package src.main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Pair of gloves
 * Winter is coming, you must prepare your ski holidays. The objective of this kata is to determine the number of pair of gloves you can constitute from the gloves you have in your drawer.
 * <p>
 * Given an array describing the color of each glove, return the number of pairs you can constitute, assuming that only gloves of the same color can form pairs.
 * <p>
 * Examples:
 * input = ["red", "green", "red", "blue", "blue"]
 * result = 2 (1 red pair + 1 blue pair)
 * <p>
 * input = ["red", "red", "red", "red", "red", "red"]
 * result = 3 (3 red pairs)
 **/

public class PairOfGloves {

    public static int numberOfPairs(String[] gloves) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(gloves).forEach(x -> map.merge(x, 1, Integer::sum));
        return map.values().stream().mapToInt(x -> x / 2).sum();
    }
}
