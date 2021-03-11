package visitor;

public class DoctorVisitor extends AbstractVisitor {
    @Override
    public void visit(Person person) {
        System.out.println("这个人不行了：" + person.toString());
    }
}
