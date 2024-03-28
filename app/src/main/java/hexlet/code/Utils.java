package hexlet.code;

import java.util.Random;
public class Utils {
    public static final int RANGE_LIMIT_0 = 0;
    public static final int RANGE_LIMIT_1 = 1;
    public static final int RANGE_LIMIT_10 = 10;
    public static final int RANGE_LIMIT_100 = 100;

    public static final int MIN_GENERATE = 1;
    public static final int MAX_GENERATE = 100;
    private static final Random RANDOM = new Random();

    public static int getRandom(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
