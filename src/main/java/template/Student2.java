package template;

/**
 * 子类，定义具体实现逻辑
 */
public class Student2 extends Student {
    @Override
    public void answerQuestion1() {
        System.out.println("Student2\tquestion1\tchoose C");
    }

    @Override
    public void answerQuestion2() {
        System.out.println("Student2\tquestion1\tchoose B");
    }
}
