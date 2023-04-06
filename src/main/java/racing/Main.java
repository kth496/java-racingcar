package racing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameParameter gameParameter = takeInput();
        runGameWith(gameParameter);
    }

    private static GameParameter takeInput() {
        Scanner scanner = new Scanner(System.in);

        UserView.showCarCountQuestion();
        int countOfCar = Integer.parseInt(scanner.nextLine());

        UserView.showTryCountQuestion();
        int countOfTry = Integer.parseInt(scanner.nextLine());

        return new GameParameter(countOfCar, countOfTry);
    }

    private static void runGameWith(GameParameter gameParameter) {
        UserView.showResultMessageTitle();
        Garage garage = new Garage();

        garage.createNewCars(gameParameter.getCountOfCar());

        garage.getAllCars().forEach((car) -> System.out.println(car.getPositionalString()));
        System.out.println();

        for (int i = 0; i < gameParameter.getCountOfTry(); i++) {
            garage.getAllCars().forEach((car) -> {
                int value = RandomNumberGenerator.makeRandomNumber();
                ControlCenter.moveCar(car, value);
                System.out.println(car.getPositionalString());
            });
            System.out.println();
        }
    }
}
