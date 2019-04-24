//: typeinfo/pets/Manx.java
package typeinfo.pets;

public class Manx extends Cat {
  public static class Factory implements InnerFactory<Manx> {
    public Manx create() { return new Manx(); }
    public Class<Manx> getOuterClass() { return Manx.class; }
  }
  public Manx(String name) { super(name); }
  public Manx() { super(); }
} ///:~
