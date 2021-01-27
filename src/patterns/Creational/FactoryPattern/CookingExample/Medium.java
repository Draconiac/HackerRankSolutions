package patterns.Creational.FactoryPattern.CookingExample;

public class Medium implements Cook {
    @Override
    public void cookItWith() {
        System.out.println("For rare cook, oven set to 200 for 10 min");
    }
}
