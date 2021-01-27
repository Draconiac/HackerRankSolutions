package patterns.Creational.FactoryPattern.ButtonExample;

public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
