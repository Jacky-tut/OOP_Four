package homework;

public class Orange extends Fruit{
    private String name = "orange";

    public Orange() {
        super(1.5f);
    }

    public Orange(int amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return name;
    }
}
