package racing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garage {
    private final List<Car> cars;

    public Garage() {
        this.cars = new ArrayList<>();
    }

    public void createNewCars(int count) {
        for (int i = 0; i < count; i++) {
            cars.add(new Car());
        }
    }

    public List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);
    }
}
