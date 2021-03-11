package visitor;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(35);
        // 具体访问者
        AbstractVisitor policeVisitor = new PoliceVisitor();
        AbstractVisitor doctorVisitor = new DoctorVisitor();
        person.receiveVisitor(policeVisitor);
        person.receiveVisitor(doctorVisitor);
    }
}
