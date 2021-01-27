package patterns.Creational.FactoryPattern.CookingExample;

public class Rare implements Cook {
    @Override
    public void cookItWith() {
        System.out.println("For rare cook, oven set to 180 for 8 min");
    }
}
