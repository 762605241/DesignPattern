package prototype;

/**
 * 通过原型模式，克隆多个相同对象
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Address address = new Address();
        address.setCountry("中国");
        address.setProvince("北京");
        person.setName("张三");
        person.setAddress(address);
        System.out.println(person);
        Person person1 = (Person) person.clone();
        person.getAddress().setProvince("长沙");
        System.out.println(person);
        System.out.println(person1);
    }
}
