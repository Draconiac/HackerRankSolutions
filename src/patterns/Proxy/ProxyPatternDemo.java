package patterns.Proxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {

        Image image = new ProxyImage("proxyPattern.png");

        image.display(); // image will be loaded from disk
        System.out.println("");
        image.display();// image will not be loaded from disk

    }
}
