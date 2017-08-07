/**
 * Created by User on 08.08.2017.
 */
public class FacadePattern {
    public static void main(String[] args) {
        Power power = new Power();
        power.on();

        DVDRom dvd = new DVDRom();
        dvd.load();

        HDD hdd = new HDD();
        hdd.copyFromDVD(dvd);
    }
}

class Power{
    void on() {
        System.out.println("Power on");
    }
    void off() {
        System.out.println("Power off");
    }
}

class DVDRom {
    private boolean data = false;
    public boolean hasData() {
        return data;
    }
    void load() {
        data = true;
    }
    void unload() {
        data = false;
    }
}

class HDD {
    void copyFromDVD(DVDRom dvd) {
        if (dvd.hasData()) {
            System.out.println("The data from DVD is copying");
        }
        else {
            System.out.println("Insert the DVD with data!");
        }
    }
}