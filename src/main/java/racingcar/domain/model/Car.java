package racingcar.domain.model;

public class Car {

    private final String name;
    private int postion = 0;

    public Car(String name) {
        this.name = name;
    }

    void move() {
        this.postion++;
    }

    public boolean isPositionEqualTo(int ohterPosition) {
        return postion == ohterPosition;
    }


    public String getName() {
        return name;
    }

    public int getPostion() {
        return postion;
    }
}
