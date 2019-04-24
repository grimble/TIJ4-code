//: typeinfo/pets/Mutt.java
package typeinfo.pets;

public class Mutt extends Dog {
  public static class Factory implements InnerFactory<Mutt> {
    public Mutt create() { return new Mutt(); }
    public Class<Mutt> getOuterClass() { return Mutt.class; }
  }
  public Mutt(String name) { super(name); }
  public Mutt() { super(); }
} ///:~
