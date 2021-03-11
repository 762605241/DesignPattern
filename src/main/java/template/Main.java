package template;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student1();
        Student student2 = new Student2();
        // 调用模板方法，但执行具体逻辑
        student1.answerExam();
        System.out.println();
        student2.answerExam();
    }
}
