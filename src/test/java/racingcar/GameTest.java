package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Game;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GameTest {

    @DisplayName("게임 생성 테스트")
    @Test
    void makeGame() {
        Game game = new Game("pobi,woni,woo");

        assertThat(game.playerList().totalCar()).isEqualTo(3);
    }

    @DisplayName("비정상적인 플레이어 이름으로 게임 생성 테스트")
    @Test
    void makeInvalidGame() {
        assertThatThrownBy(() -> {
            new Game("pobi,woni,name_exceed5");
        }).isInstanceOf(IllegalArgumentException.class).hasMessage("자동차 이름은 5글자를 초과할 수 없습니다.");
    }
}
