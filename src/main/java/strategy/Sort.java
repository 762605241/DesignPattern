package strategy;

/**
 * 算法集合抽象类，表示一系列算法。
 * 通过集成该类，使所有算法可以互相替代，具体执行逻辑由具体算法实现类实现。
 */
public abstract class Sort {
    public abstract void sort();
}
