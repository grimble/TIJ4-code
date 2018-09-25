//: polymorphism/music3/Music3.java
// An extensible program.
package polymorphism.music3;
import java.util.*;
import polymorphism.music.Note;
import static net.mindview.util.Print.*;

class Instrument {
  void play(Note n) { print("Instrument.play() " + n); }
  public String toString() { return "Instrument"; }
  void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
  void play(Note n) { print("Wind.play() " + n); }
  public String toString() { return "Wind"; }
  void adjust() { print("Adjusting Wind"); }
}	

class Percussion extends Instrument {
  void play(Note n) { print("Percussion.play() " + n); }
  public String toString() { return "Percussion"; }
  void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
  void play(Note n) { print("Stringed.play() " + n); }
  public String toString() { return "Stringed"; }
  void adjust() { print("Adjusting Stringed"); }
}

class Guitar extends Stringed {
  void play(Note n) { print("Guitar.play() " + n); }
  public String toString() { return "Guitar"; }
  void adjust() { print("Adjusting Guitar"); }
}

class Brass extends Wind {
  void play(Note n) { print("Brass.play() " + n); }
  void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
  void play(Note n) { print("Woodwind.play() " + n); }
  public String toString() { return "Woodwind"; }
}

class InstrumentGenerator {
  static Random rnd= new Random(25);
  static Instrument next() {
    int i= rnd.nextInt(6);
    switch (i) {
      case 0: return new Woodwind();
      case 1: return new Percussion();
      case 2: return new Stringed();
      case 3: return new Brass();
      case 4: return new Guitar();
      case 5: return new Wind();
      default: return null;
    }

  }
}

public class Music3 {
  // Doesn't care about type, so new types
  // added to the system still work right:
  public static void tune(Instrument i) {
    // ...
    i.play(Note.MIDDLE_C);
  }
  public static void tuneAll(Instrument[] e) {
    for(Instrument i : e)
      tune(i);
  }	
  public static void main(String[] args) {
    // Upcasting during addition to the array:
    Instrument[] orchestra = new Instrument[10];
    for (int i= 0; i < orchestra.length; i++)
      orchestra[i]= InstrumentGenerator.next();
    for (Instrument instrument : orchestra)
      System.out.println(instrument);
    tuneAll(orchestra);
  }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
