package ru.iaulitin.patterns.creational.factorymethod;

public class Cat implements Animal {
    @Override
    public void produceSound() {
        System.out.println("MEOW");
    }
}
