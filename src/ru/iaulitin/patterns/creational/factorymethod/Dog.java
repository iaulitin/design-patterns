package ru.iaulitin.patterns.creational.factorymethod;

public class Dog implements Animal {
    @Override
    public void produceSound() {
        System.out.println("BOW");
    }
}
