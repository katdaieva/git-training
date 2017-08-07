/**
 * Created by User on 07.08.2017.
 */
public class DelegatePattern {
    public static void main(String[] args) {
        A a  = new A();
        a.f();
    }
}

class A {
    void f() {
        System.out.println("f()");
    }
}

class B {
    A a = new A();
    void f() {
        a.f();
    }
}

interface Graphics {
    void draw();
}

class Triangle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Draw a triangle");
    }
}

class Square implements Graphics {
    @Override
    public void draw() {
        System.out.println("Draw a square");
    }
}

class Circle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }
}

class Painter {
    Graphics graphics;
    void setGraphics(Graphics g) {
        graphics = g;
    }
    void draw() {
        graphics.draw();
    }
}