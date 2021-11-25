package ru.iaulitin.patterns.creational.abstractfactory;

public class VictorianFactory implements AbstractFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
