package iterator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        String[] names = {"张三", "李四", "王五"};
        person.setName(names);
        Iterator<String> iterator = person.getIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
