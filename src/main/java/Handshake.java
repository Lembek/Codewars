package src.main.java;

/**
 * Johnny is a farmer and he annually holds a beet farmers convention "Drop the beet".
 * <p>
 * Every year he takes photos of farmers handshaking.
 * Johnny knows that no two farmers handshake more than once.
 * He also knows that some of the possible handshake combinations may not happen.
 * <p>
 * However, Johnny would like to know the minimal amount of people
 * that participated this year just by counting all the handshakes.
 * <p>
 * Help Johnny by writing a function, that takes the amount of handshakes and returns
 * the minimal amount of people needed to perform these handshakes (a pair of farmers handshake only once).
 **/

public class Handshake {

    public static int GetParticipants(int handshakes) {
        switch (handshakes) {
            case 0:
                return 0;
            case 1:
                return 2;
            case 2:
                return 4;
            default:
                int result = 0;
                while (true) {
                    result++;
                    handshakes -= result;
                    if (handshakes <= 0)
                        return ++result;
                }
        }
    }
}
