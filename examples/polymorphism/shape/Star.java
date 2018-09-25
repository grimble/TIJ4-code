package polymorphism.shape;

import static net.mindview.util.Print.*;

public class Star extends Shape {
    public void draw() { print("Star.draw()"); }
    public void erase() { print("Star.erase()"); }
    public void move() { print("Star.move()"); }
}
