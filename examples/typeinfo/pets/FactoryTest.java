package typeinfo.pets;

class MyClass {
    public static abstract class Factory {
        public abstract MyClass create();
    }
}

class MyClass1 extends MyClass {
    public static class Factory {
        public MyClass1 create() { return new MyClass1(); };
    }
}

class MyClass2 extends MyClass {
    public static class Factory {
        public MyClass2 create() { return new MyClass2(); };
    }
}

public class FactoryTest {

    public static void main(String[] args) {

        System.out.println(MyClass1.Factory.class.equals(MyClass1.Factory.class));
    }
}
