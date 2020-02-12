package module;

public class Birds extends Animals {
    private int speed;

    public String fly() {
        return "某天它先翱翔天空，";
    }

    public Birds() {
    }

    public Birds(int speed) {
        this.speed = speed;
    }

    public Birds(int age, int weight) {
        super(age, weight);
    }

    public Birds(int age, int weight, int speed) {
        super(age, weight);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
