package template;

/**
 * 抽象类，定义模板，模板包含一个具体操作的执行逻辑，具体执行逻辑依据子类进行实现
 * 所有学生都进行考试，没人都回答两道题。执行逻辑分别是answerQuestion1，answerQuestion2
 * 所以学生都要回答两道题，但两道题具体回答逻辑可能不同。
 */
public abstract class Student {
    public abstract void answerQuestion1();

    public abstract void answerQuestion2();

    /**
     * 定义模板方法
     */
    public final void answerExam() {
        answerQuestion1();
        answerQuestion2();
    }
}
