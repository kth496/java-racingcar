package racing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameParameter gameParameter = takeInput();
        runGameWith(gameParameter);
    }

    private static GameParameter takeInput() {
        Scanner scanner = new Scanner(System.in);
        return new GameParameter(takeCountOfCar(scanner), takeCountOfTry(scanner));
    }

    private static int takeCountOfCar(Scanner scanner) {
        UserView.showCarCountQuestion();
        return Integer.parseInt(scanner.nextLine());
    }

    private static int takeCountOfTry(Scanner scanner) {
        UserView.showTryCountQuestion();
        return Integer.parseInt(scanner.nextLine());
    }

    private static void runGameWith(GameParameter gameParameter) {
        UserView.showResultMessageTitle();
        Garage garage = Garage.init(gameParameter.getCountOfCar());
        showGarageState(garage);
        iterateEachGameStep(gameParameter, garage);
    }

    private static void showGarageState(Garage garage) {
        System.out.println(garage + "\n");
    }

    private static void iterateEachGameStep(GameParameter gameParameter, Garage garage) {
        for (int i = 0; i < gameParameter.getCountOfTry(); i++) {
            moveAllCarsIn(garage);
            showGarageState(garage);
        }
    }

    private static void moveAllCarsIn(Garage garage) {
        garage.getAllCars().forEach((car) -> {
            int value = RandomNumberGenerator.makeRandomNumber();
            ControlCenter.moveCar(car, value);
        });
    }
}
