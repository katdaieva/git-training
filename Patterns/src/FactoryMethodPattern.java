import java.util.Date;

/**
 * Created by User on 08.08.2017.
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        Watch watch = new DigitalWatch();
        watch.showTime();
    }
}

interface Watch {
    void showTime();
}

class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("VII-XX");
    }
}