package shop.entity;

/**
 * Created by User on 27.07.2017.
 */
public class Flower extends Plant {
    boolean isMultiFlower;

    public Flower(String name, int count, boolean isMultiFlower) {
        super(name, count);
        this.isMultiFlower = isMultiFlower;
    }

    public String toString() {
        return this.name + ": there " + (isMultiFlower == false ? "is one flower." : "are more flowers!");
    }
}
