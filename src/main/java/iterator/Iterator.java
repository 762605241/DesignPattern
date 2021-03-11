package iterator;

/**
 * 迭代器，用于迭代元素
 */
public interface Iterator<T> {
    public abstract boolean hasNext();
    public abstract T next();
}
