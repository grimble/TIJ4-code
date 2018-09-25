//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package polymorphism.shape;
import java.util.*;

public class RandomShapeGenerator {
  private Random rand;
  public RandomShapeGenerator(int seed) {
     rand= new Random(seed);
  }
  public Shape next() {
    switch(rand.nextInt(4)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
      case 3: return new Star();
    }
  }
} ///:~
