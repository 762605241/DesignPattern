package strategy;

/**
 * 容器 接收不同策略
 */
public class Container {
    /**
     * 接收不同策略，执行具体策略的逻辑
     * @param sort
     */
    public void doOperation(Sort sort) {
        sort.sort();
    }
}
