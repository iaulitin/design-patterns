package ru.iaulitin.patterns.creational.prototype;

public class CloneableCell implements Cloneable {
    private CellType cellType;
    private Human owner;


    public CloneableCell(CellType cellType, Human owner) {
        this.cellType = cellType;
        this.owner = owner;
    }


    @Override
    public CloneableCell clone() throws CloneNotSupportedException {
        return (CloneableCell) super.clone();
    }


    @Override
    public String toString() {
        return "CloneableCell{" +
                "cellType=" + cellType +
                ", owner=" + owner +
                '}';
    }
}
