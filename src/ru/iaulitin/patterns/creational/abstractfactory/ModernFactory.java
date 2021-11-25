package ru.iaulitin.patterns.creational.abstractfactory;

public class ModernFactory implements AbstractFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
