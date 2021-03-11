package factory_method;


/**
 * 具体产品
 * 华为手机
 */
public class HuaweiPhone extends Phone {
    public void call() {
        System.out.println("华为手机正在打电话......");
    }
}
