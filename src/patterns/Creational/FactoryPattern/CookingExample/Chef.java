package patterns.Creational.FactoryPattern.CookingExample;

public class Chef {

    private static Oven oven;

    public static void main(String[] args) {
        askForCookingType("Medium");
        cookMeal();
    }

    static void askForCookingType(String type){
        if(type.equals("Rare")){
            oven = new CookRare();
        }else if(type.equals("Medium")){
            oven = new CookMedium();
        }else if(type.equals("Welldone")){
            oven = new CookWelldone();
        }
    }

    static void cookMeal(){
        oven.openOven();
    }
}
