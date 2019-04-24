package typeinfo.pets;

import java.util.*;

import typeinfo.factory.*;

interface InnerFactory<T> extends Factory<T> {
    public abstract Class<T> getOuterClass();
}

public class FactoryPetCreator extends PetCreator {

    public static final List<InnerFactory<? extends Pet>> allTypes= new ArrayList<InnerFactory<? extends Pet>>();

    static {
        allTypes.add(new Mouse.Factory());
        allTypes.add(new Mutt.Factory());
        allTypes.add(new Manx.Factory());
    }

    @Override
    public List<Class<? extends Pet>> types() {
        List<Class<? extends Pet>> tt= new ArrayList<Class<? extends Pet>>();
        for (InnerFactory<? extends Pet> f : allTypes) {
            tt.add(f.getOuterClass());

        }
        return tt;
    }
}
