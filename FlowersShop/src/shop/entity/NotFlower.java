package shop.entity;

/**
 * Created by User on 27.07.2017.
 */
public class NotFlower extends Plant{
    boolean isMultiNotFlower;

    public NotFlower(String name, int count, boolean isMultiFlower) {
        super(name, count);
        this.isMultiNotFlower = isMultiNotFlower;
    }

    public String toString() {
        return this.name + ": there is " + (isMultiNotFlower == false ? "only a branch." : "a bush!");
    }
}
