package prototype;

/**
 * 原型模式
 * 实现Cloneable标志接口
 * 实现clone方法
 * 进行原型克隆出多个实例
 */
public class Person implements Cloneable {
    public String name;
    public Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = new Person();
        Address address = (Address) this.getAddress().clone();
        person.setAddress(address);
        person.setName(this.name);
        return person;
    }
}
