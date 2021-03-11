package interpreter;

/**
 * 非终端解释器
 * 构建语句
 * 解释当前语句
 */
public class PlusExpression extends Expression {

    /**
     * 解释语句
     */
    @Override
    public void interpret(Context context1, Context context2) {
        System.out.println("该语句语义为\tcontext1与context2求和");
        System.out.println("解释结果\t" + (context1.getData() + context2.getData()));
    }
}
