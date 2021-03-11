package facade;

public class Main {
    public static void main(String[] args) {
        // 客户端访问系统，访问门面类即可
        Facade facade = new Facade();
        // 直接访问门面对象对应接口即可
        facade.investment();
    }
}
