package prototype;

/**
 * Person属性
 * 也需要实现Cloneable接口，重写clone方法
 */
public class Address implements Cloneable {
    public String country;
    public String province;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address address = new Address();
        address.setCountry(this.country);
        address.setProvince(this.province);
        return address;
    }
}
