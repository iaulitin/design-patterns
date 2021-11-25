package ru.iaulitin.patterns.creational.prototype;

public class Demo {

    public static void main(String[] args) {
        Human boy = new Human("Christopher", "Robin", 8);
        CloneableCell original = new CloneableCell(CellType.BRAIN, boy);
        System.out.println("Original cell:" + original);
        System.out.println("Original cell hash:" + original.hashCode());

        try {
            CloneableCell clone = original.clone();
            System.out.println("Clone cell:" + clone);
            System.out.println("Clone cell hash:" + clone.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
