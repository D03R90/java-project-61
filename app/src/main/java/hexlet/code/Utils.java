package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int MIN_GENERATE = 1;
    public static final int MAX_GENERATE = 100;
    
    public static int randomNumber(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
    
    public static int randomNumber() {
        return randomNumber(1, 100);
    }
}
