package src.main.java;

/**
 * You throw a ball vertically upwards with an initial speed v (in km per hour).
 * The height h of the ball at each time t is given by h = v*t - 0.5*g*t*t where g is Earth's gravity (g ~ 9.81 m/s**2).
 * A device is recording at every tenth of second the height of the ball.
 * For example with v = 15 km/h the device gets something of the following form: (0, 0.0), (1, 0.367...), (2, 0.637...), (3, 0.808...), (4, 0.881..)
 * ... where the first number is the time in tenth of second and the second number the height in meter.
 * <p>
 * Task
 * Write a function max_ball with parameter v (in km per hour) that returns the time in tenth of second of the maximum height recorded by the device.
 * <p>
 * Examples:
 * max_ball(15) should return 4
 * <p>
 * max_ball(25) should return 7
 * <p>
 * Notes
 * Remember to convert the velocity from km/h to m/s or from m/s in km/h when necessary.
 * The maximum height recorded by the device is not necessarily the maximum height reached by the ball.
 **/

public class Ball {

    public static int maxBall(int v0) {
        double newV = v0 * 1000 * 1.0 / 3600;
        double t = 0;
        double h;
        double maxH = 0;
        int result = 0;
        while (true) {
            t += 0.1;
            h = newV * t - 9.81 / 2 * t * t;
            if (maxH < h) {
                result++;
                maxH = h;
            } else
                return result;
        }
    }
}
