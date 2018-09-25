//: control/WhileTest.java
package control; /* Added by Eclipse.py */
// Demonstrates the while loop.

public class WhileTest {
  static int count;
  static boolean condition() {
    double random= Math.random();
    boolean result = random < 0.99;
    System.out.print((count++) + ": " + random + " " + result + ", ");
    return result;
  }
  public static void main(String[] args) {
    while(condition())
      System.out.println("Inside 'while'");
    System.out.println("Exited 'while'");
  }
} /* (Execute to see output) *///:~
