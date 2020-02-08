package module;

public class Eagles extends Birds {
    private String[] preys;

    public String hunt() {
        return "捕食";
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
