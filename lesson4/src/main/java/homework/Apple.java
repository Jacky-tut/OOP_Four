package homework;

public class Apple extends Fruit{
    private String name = "apple";

    public Apple() {
        super(1f);
    }

    public Apple(int amount) {
        super(amount);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
