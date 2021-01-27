package patterns.Creational.FactoryPattern.CookingExample;

public class CookRare  extends Oven{
    @Override
    public Cook cookMeat() {
        return new Rare();
    }
}
