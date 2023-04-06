package racing;

import java.util.Random;

public class RandomNumberGenerator {
    private static final int UPPER_BOUND = 10;
    private static final Random random = new Random();

    public static int makeRandomNumber() {
        return random.nextInt(UPPER_BOUND);
    }
}
