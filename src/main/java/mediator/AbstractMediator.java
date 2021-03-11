package mediator;

import java.util.HashMap;

/**
 * 中介者，来管理其他类对象之间的复杂调用逻辑。
 * 让其他类对象，只与中介者关联，不再与其他类对象关联。减少耦合。
 * 并在中介者中维护所有与中介者关联的类，保证类对象在互相关联是存在且可以使用。
 * 消息中间件，各个部门将消息发送至中间件，各个部门从中间件中取出自己想要的数据（调用某个部门，让某个部门协助执行）
 */
public abstract class AbstractMediator {
    /**
     * 记录中介者所管理的所有部门
     */
    private HashMap<String, AbstractDepartment> map = new HashMap<>();

    /**
     * 中介者调节各部门调用的业务逻辑， 处理各个部门的关联
     *
     * @param deptName
     * @param method
     */
    public abstract void execute(String deptName, String method);

    /**
     * 向中介者中添加管理的部门
     *
     * @param name
     * @param dept
     */
    public void addDept(String name, AbstractDepartment dept) {
        map.put(name, dept);
    }

    /**
     * 从中介者中删除所管理的部门
     *
     * @param name
     */
    public void removeDept(String name) {
        map.remove(name);
    }

    public HashMap<String, AbstractDepartment> getMap() {
        return map;
    }

    public void setMap(HashMap<String, AbstractDepartment> map) {
        this.map = map;
    }
}
