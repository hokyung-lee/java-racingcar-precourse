# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구 사항
* [ ] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있음
  * [X] 자동차 전진
  * [X] 전진하는 조건은 숫자가 4 이상일 경우 전진, 3 이하의 값이면 멈춤
  * [ ] 숫자는 랜덤으로 0~9 사이의 숫자를 생성
  * [ ] n대 자동차 생성
* [X] 각 자동차에 이름을 부여할 수 있음
    * [X] 이름은 5자 이하
    * [X] 이름은 1자 이상
### 입력
* [ ] 자동차 이름은 쉼표(,)를 기준으로 구분하며 입력 받음
* [ ] 사용자는 몇 번의 이동을 할 것인지 입력할 수 있어야 함
    * [ ] 숫자만 입력 가능
### 출력
* [ ] 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력
* [ ] 자동차 경주 게임을 완료한 후 누가 우승했는지 알려줌
* [ ] 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력
* [ ] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생 시키고,"[ERROR]"로 시작하는 에러 메세지를 출력 후 그 부분부터 입력을 다시 받음