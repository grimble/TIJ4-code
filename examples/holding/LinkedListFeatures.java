//: holding/LinkedListFeatures.java
package holding; /* Added by Eclipse.py */
import typeinfo.pets.*;
import java.util.*;
import static net.mindview.util.Print.*;

public class LinkedListFeatures {
  public static void main(String[] args) {
    LinkedList<Pet> pets =
      new LinkedList<Pet>(Pets.arrayList(5));
    print(pets);
    // Identical:
    print("pets.getFirst(): " + pets.getFirst());
    print("pets.element(): " + pets.element());
    // Only differs in empty-list behavior:
    print("pets.peek(): " + pets.peek());
    // Identical; remove and return the first element:
    print("pets.remove(): " + pets.remove());
    print(pets);
    print("pets.removeFirst(): " + pets.removeFirst());
    print(pets);
    // Only differs in empty-list behavior:
    print("pets.poll(): " + pets.poll());
    print(pets);
    pets.addFirst(new Rat());
    print("After addFirst(new Rat()): " + pets);
    pets.offer(Pets.randomPet());
    print("After offer(Pets.randomPet()): " + pets);
    pets.add(Pets.randomPet());
    print("After add(Pets.randomPet()): " + pets);
    pets.addLast(new Hamster());
    print("After addLast(new Hamster()): " + pets);
    print("pets.removeLast(): " + pets.removeLast());
    print(pets);
  }
} /* Output:
[Rat, Manx, Cymric, Mutt, Pug]
pets.getFirst(): Rat
pets.element(): Rat
pets.peek(): Rat
pets.remove(): Rat
[Manx, Cymric, Mutt, Pug]
pets.removeFirst(): Manx
[Cymric, Mutt, Pug]
pets.poll(): Cymric
[Mutt, Pug]
After addFirst(new Rat()): [Rat, Mutt, Pug]
After offer(Pets.randomPet()): [Rat, Mutt, Pug, Cymric]
After add(Pets.randomPet()): [Rat, Mutt, Pug, Cymric, Pug]
After addLast(new Hamster()): [Rat, Mutt, Pug, Cymric, Pug, Hamster]
pets.removeLast(): Hamster
[Rat, Mutt, Pug, Cymric, Pug]
*///:~
