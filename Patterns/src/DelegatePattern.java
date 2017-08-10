/**
 * Created by User on 07.08.2017.
 */
public class DelegatePattern {
    public static void main(String[] args) {
      /*  A a  = new A();
        a.f();*/
      Painter painter = new Painter();
      painter.setGraphics(new SquareD());
      painter.draw();

      painter.setGraphics(new TriangleD());
      painter.draw();
    }
}

/*class A {
        void f() {
        System.out.println("f()");
        }
        }

class B {
    A a = new A();
    void f() {
        a.f();
    }
}*/

interface Graphics {
    void draw();
}

class TriangleD implements Graphics {
    @Override
    public void draw() {
        System.out.println("Draw a triangle");
    }
}

class SquareD implements Graphics {
    @Override
    public void draw() {
        System.out.println("Draw a square");
    }
}

class CircleD implements Graphics {
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