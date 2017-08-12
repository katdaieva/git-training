/**
 * Created by User on 11.08.2017.
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        //PrinterInterface printer = new Printer("Hello!");
        PrinterInterface printer = new LeftBracketDecorator(new Printer("Hello!")); //new QuotesDecorator(new Printer("Hello!"));
        printer.print();
    }
}

interface PrinterInterface {
    void print();
}

class Printer implements PrinterInterface {
    String value;
    public Printer(String value) {
        this.value = value;
    }
    public void print() {
        System.out.print(value);
    }
}

class QuotesDecorator implements PrinterInterface {
    PrinterInterface component;
    public QuotesDecorator(PrinterInterface component) {
        this.component = component;
    }
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}

class LeftBracketDecorator implements PrinterInterface {
    PrinterInterface component;
    public LeftBracketDecorator(PrinterInterface component) {
        this.component = component;
    }
    public void print() {
        System.out.print("[");
        component.print();
    }
}