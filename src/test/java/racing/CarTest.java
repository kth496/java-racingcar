package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    @DisplayName("자동차는 앞으로 갈 수 있다.")
    public void goForwardTest() {
        Car car = new Car();
        car.goForward();
        assertThat(car.getPosition()).isEqualTo(2);
    }

    @Test
    @DisplayName("자동차의 위치를 문자열로 반환할 수 있다.")
    public void positionalStringTest() {
        Car car = new Car();
        car.goForward();
        car.goForward();
        assertThat(car.getPositionalString()).isEqualTo("---");
    }
}
