package builder;

public class Main {

    public static void main(String[] args) {
        /**
         * 根据不同要求 组装类
         */
        Builder builder = new Builder();
        Person person1 = builder.builder().setName("张三").setAge("12").build();

        builder.builder();
        Person person2 = builder.setName("李四").setAge("26").setJob("程序员").build();

        System.out.println(person1);
        System.out.println(person2);
    }
}
