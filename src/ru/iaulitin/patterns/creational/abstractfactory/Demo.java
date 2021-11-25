package ru.iaulitin.patterns.creational.abstractfactory;

public class Demo {

    public static void main(String[] args) {
        AbstractFactory victorianFactory = new VictorianFactory();
        AbstractFactory modernFactory = new ModernFactory();
    }
}
