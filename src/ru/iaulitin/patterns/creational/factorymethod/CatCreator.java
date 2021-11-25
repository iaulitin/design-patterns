package ru.iaulitin.patterns.creational.factorymethod;

public class CatCreator implements Creator {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
