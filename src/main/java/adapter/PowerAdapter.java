package adapter;

public class PowerAdapter {
    public Socket_5V charge(Socket_220 socket_220) {
        System.out.println("220V转5V电源");
        return new Socket_5V();
    }
}
