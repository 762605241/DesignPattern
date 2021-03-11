package adapter;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Socket_220 socket_220 = new Socket_220();
//        phone.charge(socket_220); 不能接受220V电源
        PowerAdapter powerAdapter = new PowerAdapter();
        phone.charge(powerAdapter.charge(socket_220));
    }
}
