package factory_method;

/**
 *  抽象工厂
 *  获取产品父类
 *  由子类实现获取具体产品方法
 */
public abstract class PhoneFactory {

    abstract Phone getPhone();
}
