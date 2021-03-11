package builder;

/**
 * 建造者类，负责创建复杂对象的具体属性
 */
public class Builder {

    private Person person;

    public Builder setName(String name) {
        person.setName(name);
        return this;
    }
    public Builder setAge(String age) {
        person.setAge(age);
        return this;
    }
    public Builder setJob(String job) {
        person.setJob(job);
        return this;
    }

    public Builder builder() {
        person = new Person();
        return this;
    }

    public Person build() {
        return person;
    }
}
