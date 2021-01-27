package patterns.Creational.FactoryPattern.CookingExample;

public class Welldone implements Cook {
    @Override
    public void cookItWith() {
        System.out.println("For rare cook, oven set to 220 for 12 min");
    }
}
