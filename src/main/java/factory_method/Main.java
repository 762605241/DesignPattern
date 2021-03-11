package factory_method;

import com.sun.org.apache.xpath.internal.operations.String;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory1 = new XiaomiPhoneFactory();
        XiaomiPhone xiaomiPhone = (XiaomiPhone) phoneFactory1.getPhone();

        PhoneFactory phoneFactory2 = new HuaweiPhoneFactory();
        HuaweiPhone huaweiPhone = (HuaweiPhone) phoneFactory2.getPhone();

        xiaomiPhone.call();
        huaweiPhone.call();
    }
}
