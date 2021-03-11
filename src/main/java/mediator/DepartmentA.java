package mediator;

/**
 * 具体部门
 */
public class DepartmentA extends AbstractDepartment {

    public DepartmentA(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 每个部门自己的业务逻辑
     */
    public void self() {
        System.out.println("部门A处理自己业务.......");
    }

    /**
     * 与其他部门交互的业务逻辑
     * 通过中介者去调用具体部门的业务逻辑
     */
    public void out() {
        System.out.println("请部门B来处理业务");
        mediator.execute("DepartmentB", "self");
    }
}
