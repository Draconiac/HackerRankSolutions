package patterns.Creational.FactoryPattern.ButtonExample;

public class HTMLDialog extends  Dialog{
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
