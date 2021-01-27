package patterns.Creational.FactoryPattern.CookingExample;

public class CookWelldone extends Oven{
    @Override
    public Cook cookMeat() {
        return new Welldone();
    }
}
