package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ControlCenterTest {
    @ParameterizedTest
    @CsvSource(value = {"1:1", "2:1", "3:1", "4:2", "5:2", "6:2", "7:2", "8:2", "9:2"}, delimiter = ':')
    @DisplayName("기준점에 맞을때만 자동차를 앞으로 가게 한다.")
    public void thresholdTest1(int randomValue, int expectedPosition) {
        Car car = new Car();
        ControlCenter.moveCar(car, randomValue);
        assertThat(car.getPosition()).isEqualTo(expectedPosition);
    }
}
