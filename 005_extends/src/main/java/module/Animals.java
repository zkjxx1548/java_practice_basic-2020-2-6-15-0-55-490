package module;

public class Animals {
    private int age;
    private int weight;

    public String eat() {
        return "饱餐";
    }

    public String sleep() {
        return "睡觉";
    }

    public Animals() {
    }

    public Animals(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
