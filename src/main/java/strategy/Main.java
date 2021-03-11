package strategy;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        Sort sort1 = new InsertSort();
        container.doOperation(sort1);
        Sort sort2 = new QuickSort();
        container.doOperation(sort2);
    }
}
