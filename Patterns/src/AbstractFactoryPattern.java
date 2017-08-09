/**
 * Created by User on 09.08.2017.
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("EN");
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        Touchpad t = factory.getTouchpad();
        m.click();
        k.print();
        k.println();
        t.track(10,35);
    }
    private static DeviceFactory getFactoryByCountryCode(String lang) {
        switch (lang) {
            case "UA":
                return new UADeviceFactory();
            case "EN":
                return new ENDeviceFactory();
            default:
                throw new RuntimeException("Unsupported Country Code: " + lang);
        }
    }
}

interface Mouse {
    void click();
    void dblclick();
    void scroll(int direction);
}

interface Keyboard {
    void print();
    void println();
}

interface Touchpad {
    void track(int deltaX, int deltaY);
}

interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}

class UAMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Клацання мишкою");
    }
    @Override
    public void dblclick() {
        System.out.println("Подвійне клацання мишкою");
    }
    @Override
    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("Угору");
        else if (direction < 0)
            System.out.println("Вниз");
        else
            System.out.println("Нікуди");
    }
}

class UAKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Друкуємо рядок");
    }
    @Override
    public void println() {
        System.out.println("Друкуємо рядок із переводом на наступний");
    }
}

class UATouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("пересунулись на " + s + " пікселів");
    }
}

class ENMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Mouse click");
    }
    @Override
    public void dblclick() {
        System.out.println("Mouse double click");
    }
    @Override
    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("Scroll up");
        else if (direction < 0)
            System.out.println("Scroll down");
        else
            System.out.println("No scroll");
    }
}

class ENKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Print");
    }
    @Override
    public void println() {
        System.out.println("Print line");
    }
}

class ENTouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Moved " + s + " pixels");
    }
}

class UADeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new UAMouse();
    }
    @Override
    public Keyboard getKeyboard() {
        return new UAKeyboard();
    }
    @Override
    public Touchpad getTouchpad() {
        return new UATouchpad();
    }
}

class ENDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new ENMouse();
    }
    @Override
    public Keyboard getKeyboard() {
        return new ENKeyboard();
    }
    @Override
    public Touchpad getTouchpad() {
        return new ENTouchpad();
    }
}