package it.accenture.javaFundamentals.bank.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Developer implements Person {
    @Override
    public void speak() {

    }

    @Override
    public void eat() {

    }

    public Iterable<Developer> recruit(){
        ArrayList<Developer> a1 = new ArrayList<>();
        Developer d1 = new Developer();
        Developer d2 = new Developer();
        a1.add(d1);
        a1.add(d2);
        return a1;
    }
}
