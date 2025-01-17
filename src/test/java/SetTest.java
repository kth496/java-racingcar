import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("[요구사항 1] size 메서드로 set의 크기를 확인할 수 있다.")
    public void sizeTest1() {
        int actual = numbers.size();
        assertThat(actual).isEqualTo(3);
    }

    @Test
    @DisplayName("[요구사항 2] contains 메서드로 set에 값이 존재하는지 확인할 수 있다.")
    public void containsTest1() {
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("[요구사항 2] contains 메서드로 set에 값이 존재하는지 확인할 수 있다. w/ Parameterized Tests")
    public void containsTest2(int input) {
        assertThat(numbers.contains(input)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "-1:false", "999:false"}, delimiter = ':')
    public void containsTest3(String input, String input2) {
        int given = Integer.parseInt(input);
        boolean expected = Boolean.parseBoolean(input2);
        assertThat(numbers.contains(given)).isEqualTo(expected);
    }
}
