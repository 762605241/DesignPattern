package mediator;

/**
 * 抽象部门
 * 各个部门之间存在着关联关系
 * 通过中介者来管理之间的调用逻辑
 * 每个部门只要与中介者产生联系即可
 */
public abstract class AbstractDepartment {
    AbstractMediator mediator;

    public AbstractDepartment(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public AbstractMediator getMediator() {
        return mediator;
    }

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
