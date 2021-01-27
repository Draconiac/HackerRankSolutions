package patterns.Creational.FactoryPattern.CookingExample;

public abstract class Oven{

    public void openOven(){
        Cook cook = cookMeat();
        cook.cookItWith();
    }

    public abstract Cook cookMeat();

}
