package iterator;

/**
 * 容器抽象类，实现该类的容器，负责实现具体的迭代逻辑
 */
public abstract class Container {
    public abstract Iterator getIterator();
}
