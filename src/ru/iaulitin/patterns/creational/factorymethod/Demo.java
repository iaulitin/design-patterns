package ru.iaulitin.patterns.creational.factorymethod;

public class Demo {

    public static void main(String[] args) {
        Creator catFactory = new CatCreator();
        Creator dogFactory = new DogCreator();

        Animal cat = catFactory.createAnimal();
        Animal dog = dogFactory.createAnimal();

        cat.produceSound();
        dog.produceSound();
    }
}
