package mediator;

public class Main {
    public static void main(String[] args) {
        // 定义中介者
        AbstractMediator mediator = new Mediator();
        // 定义部门A,B
        DepartmentA departmentA = new DepartmentA(mediator);
        DepartmentB departmentB = new DepartmentB(mediator);
        // 部门AB与中介者建立联系
        mediator.addDept("DepartmentA", departmentA);
        mediator.addDept("DepartmentB", departmentB);

        // 开始协同工作
        departmentA.self();
        departmentA.out();
        System.out.println("合作愉快.......");
        System.out.println();
        departmentB.out();
        departmentB.self();
        departmentB.out();
        System.out.println("合作愉快.......");
    }
}
