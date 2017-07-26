package shop.entity;

/**
 * Created by User on 27.07.2017.
 */

import java.util.Vector;
import shop.entity.enums.*;

public class Bouquet {
    Vector<Plant> bouquet;
    String name;
    Accesories accesories;
    BouquetPrice bouquetPrice;
    BouquetIsFresh bouquetIsFresh;
    BouquetStems bouquetStems;
    BouquetSize bouquetSize;
    BouquetType bouquetType;

    public Bouquet() {}

    public Bouquet(String name) {
        setName(name);
        this.bouquet = new Vector<Plant>();
    }

    public Bouquet(String name, BouquetType bouquetType, Accesories accessories, BouquetPrice bouquetPrice,
                   BouquetIsFresh bouquetIsFresh, BouquetStems bouquetStems, BouquetSize bouquetSize) {
        setName(name);
        this.bouquet = new Vector<Plant>();
        setBouquetType(bouquetType);
        setAccesories(accesories);
        setBouquetPrice(bouquetPrice);
        setBouquetIsFresh(bouquetIsFresh);
        setBouquetStems(bouquetStems);
        setBouquetSize(bouquetSize);

    }

    public void addHerb(Plant plant) {
        this.bouquet.add(plant);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Accesories getAccesories() {
        return accesories;
    }

    public void setAccesories(Accesories accesories) {
        this.accesories = accesories;
    }

    public BouquetPrice getBouquetPrice() {
        return bouquetPrice;
    }

    public void setBouquetPrice(BouquetPrice bouquetPrice) {
        this.bouquetPrice = bouquetPrice;
    }

    public BouquetIsFresh getBouquetIsFresh() {
        return bouquetIsFresh;
    }

    public void setBouquetIsFresh(BouquetIsFresh bouquetIsFresh) {
        this.bouquetIsFresh =bouquetIsFresh;
    }

    public BouquetStems getBouquetStems() {
        return bouquetStems;
    }

    public void setBouquetStems(BouquetStems bouquetStems) {
        this.bouquetStems = bouquetStems;
    }

    public BouquetSize getBouquetSize() {
        return bouquetSize;
    }

    public void setBouquetSize(BouquetSize bouquetSize) {
        this.bouquetSize = bouquetSize;
    }

    public BouquetType getBouquetType() {
        return bouquetType;
    }

    public void setBouquetType(BouquetType bouquetType) {
        this.bouquetType = bouquetType;
    }

    public String toString() {
        String info = "";
        for (Plant herb : this.bouquet) {
            info += herb.toString();
            info += "\n";
        }

        return "Bouquet name is " + this.name + "\n" + info
                + bouquetPrice.toString() + "\n" + bouquetIsFresh.toString()
                + "\n" + bouquetStems.toString() + "\n"
                + bouquetSize.toString() + "\n" + bouquetType.toString();
    }
}
