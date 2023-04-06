package racing;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Garage {
    private final List<Car> cars;

    private Garage(int count) {
        this.cars = IntStream.of(count)
                .mapToObj(num -> new Car())
                .collect(Collectors.toList());
    }

    public static Garage init(int count) {
        return new Garage(count);
    }

    public List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);
    }

    @Override
    public String toString() {
        return cars.stream()
                .map(Car::getPositionalString)
                .collect(Collectors.joining("\n"));
    }
}
