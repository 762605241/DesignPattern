package interpreter;

/**
 * 抽象解释器
 * 解释a+b,a-b操作
 */
public abstract class Expression {
    public abstract void interpret(Context context1, Context context2);
}
