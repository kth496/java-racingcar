package racing;

public class GameParameter {
    private final int countOfCar;
    private final int countOfTry;

    public GameParameter(int countOfCar, int countOfTry) {
        this.countOfCar = countOfCar;
        this.countOfTry = countOfTry;
    }

    public int getCountOfCar() {
        return countOfCar;
    }

    public int getCountOfTry() {
        return countOfTry;
    }
}
