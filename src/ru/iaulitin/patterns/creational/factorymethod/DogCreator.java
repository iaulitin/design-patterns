package ru.iaulitin.patterns.creational.factorymethod;

public class DogCreator implements Creator {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
