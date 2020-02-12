package module;

public class Eagles extends Birds {
    private String[] preys;

    public String hunt() {
        return String.format("在饥肠辘辘之际捕食了一只%s，", getPrey()[0]);
    }

    public String info() {
        return String.format("一只%d岁的老鹰，体重%dKg，这只老鹰生活在%s窝所以它只捕食%s。",
                getAge(), getWeight(), getPrey()[0], getPrey()[0] );
    }

    public Eagles() {
    }

    public Eagles(String[] preys) {
        this.preys = preys;
    }

    public Eagles(int speed) {
        super(speed);
    }

    public Eagles(int age, int weight) {
        super(age, weight);
    }

    public Eagles(int speed, String[] preys) {
        super(speed);
        this.preys = preys;
    }

    public Eagles(int age, int weight, int speed) {
        super(age, weight, speed);
    }

    public Eagles(int age, int weight, String[] preys) {
        super(age, weight);
        this.preys = preys;
    }

    public Eagles(int age, int weight, int speed, String[] preys) {
        super(age, weight, speed);
        this.preys = preys;
    }

    public String[] getPrey() {
        return preys;
    }

    public void setPrey(String[] preys) {
        this.preys = preys;
    }
}
