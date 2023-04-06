package racing;

public class ControlCenter {
    public static final int THRESHOLD_OF_CAR_GO_FORWARD = 4;

    public static void moveCar(Car car, int value) {
        if (value >= THRESHOLD_OF_CAR_GO_FORWARD) {
            car.goForward();
        }
    }
}
