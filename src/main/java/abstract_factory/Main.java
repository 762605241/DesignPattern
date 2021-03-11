package abstract_factory;

public class Main {
    public static void main(String[] args) {
        FactoryFilter factoryFilter = new FactoryFilter();
        Factory factory = factoryFilter.getFactory("Computer");
        Computer xiaomi = factory.getComputer("xiaomi");
        xiaomi.play();
    }
}
