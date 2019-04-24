//: typeinfo/pets/Mouse.java
package typeinfo.pets;

import typeinfo.factory.Factory;

public class Mouse extends Rodent {
  public static class Factory implements InnerFactory<Mouse> {
    public Mouse create() { return new Mouse(); }
    public Class<Mouse> getOuterClass() { return Mouse.class; }
  }
  public Mouse(String name) { super(name); }
  public Mouse() { super(); }
} ///:~
