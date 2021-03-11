package interpreter;

import com.sun.org.apache.xpath.internal.operations.Plus;

public class Main {
    public static void main(String[] args) {
        // 构建语句
        Context context1 = new Context();
        context1.setData(17);
        Context context2 = new Context();
        context2.setData(5);
        // 解释语句
        Expression expression1 = new MinusExpression();
        expression1.interpret(context1, context2);
        System.out.println();
        Expression expression2 = new PlusExpression();
        expression2.interpret(context1, context2);
    }
}
