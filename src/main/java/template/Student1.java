package template;

/**
 * 子类，定义具体实现逻辑
 */
public class Student1 extends Student {
    @Override
    public void answerQuestion1() {
        System.out.println("Student1\tquestion1\tchoose A");
    }

    @Override
    public void answerQuestion2() {
        System.out.println("Student1\tquestion1\tchoose B");
    }
}
