package flyweight;

public class Main {
    public static void main(String[] args) {
        SourcePool sourcePool = new SourcePool();
        sourcePool.getSource("source1");
        sourcePool.getSource("source1");
        sourcePool.getSource("source2");
        sourcePool.getSource("source2");
    }
}
