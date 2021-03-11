package mediator;

/**
 * 具体中介者
 */
public class Mediator extends AbstractMediator{
    /**
     * 中介者的具体处理逻辑
     * @param deptName
     * @param method
     */
    @Override
    public void execute(String deptName, String method) {
        if ("DepartmentA".equals(deptName)) {
            // 执行A部门事项
            if ("self".equals(method)) {
                // A部门自己就可以完成
                DepartmentA departmentA = (DepartmentA) getMap().get(deptName);
                departmentA.self();
            } else {
                // A部门需要其他部门协助
                DepartmentA departmentA = (DepartmentA) getMap().get(deptName);
                departmentA.out();
            }
        } else {
            // 执行B部门事项
            if ("self".equals(method)) {
                // B部门自己就可以完成
                DepartmentB departmentB = (DepartmentB) getMap().get(deptName);
                departmentB.self();
            } else {
                // B部门需要其他部门协助
                DepartmentB departmentB = (DepartmentB) getMap().get(deptName);
                departmentB.out();
            }
        }
    }
}
