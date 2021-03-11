package visitor;

import observer.AbstractObserver;

/**
 * 具体访问者
 */
public class PoliceVisitor extends AbstractVisitor {
    @Override
    public void visit(Person person) {
        System.out.println("这个人犯事了：" + person.toString());
    }
}
