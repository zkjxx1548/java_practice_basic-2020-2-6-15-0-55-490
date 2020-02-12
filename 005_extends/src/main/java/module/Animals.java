package module;

public class Animals {
    private int age;
    private int weight;

    public String eat() {
        return "然后饱餐一顿，";
    }

    public String sleep() {
        return "心满意足之后就睡觉了。";
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
