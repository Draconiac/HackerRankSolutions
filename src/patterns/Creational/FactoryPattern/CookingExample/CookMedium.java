package patterns.Creational.FactoryPattern.CookingExample;

public class CookMedium extends Oven{
    @Override
    public Cook cookMeat() {
        return new Medium();
    }
}
