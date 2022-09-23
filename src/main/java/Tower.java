package src.main.java;

/**
 * Build Tower
 * Build a pyramid-shaped tower given a positive integer number of floors.
 * A tower block is represented with "*" character.
 * <p>
 * For example, a tower with 3 floors looks like this:
 * <p>
 * [
 * "  *  ",
 * " *** ",
 * "*****"
 * ]
 **/

public class Tower {
    public static String[] towerBuilder(int nFloors) {
        String[] pyramid = new String[nFloors];
        int countOfSpaces = nFloors - 1;
        int countOfStars = 1;
        for (int i = 0; i < pyramid.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(" ".repeat(countOfSpaces));
            sb.append("*".repeat(countOfStars));
            sb.append(" ".repeat(countOfSpaces));
            pyramid[i] = sb.toString();

            countOfSpaces--;
            countOfStars += 2;
        }
        return pyramid;
    }
}
