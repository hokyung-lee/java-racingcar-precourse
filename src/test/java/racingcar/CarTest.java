package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.model.Car;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @DisplayName("자동차 이름 부여해 생성 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"pobi", "woni", "jun"})
    void makeCar(String input) {
         Car car = new Car(input);
         assertThat(car.getCarName()).isEqualTo(input);
    }

    @DisplayName("자동차 이름 5글자 초과 생성 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"pobi12", "woni35", "jun123"})
    void makeCarWithOverLength(String input) {
        assertThatThrownBy(() -> {
            new Car(input);
        }).isInstanceOf(IllegalArgumentException.class).hasMessage("자동차 이름은 5글자를 초과할 수 없습니다.");
    }

    @DisplayName("자동차 전진 테스트")
    @Test
    void moveForward() {
        Car car = new Car("test");
        car.moveForward();
        car.moveForward();
        assertThat(car.getPosition()).isEqualTo(2);
    }
}
