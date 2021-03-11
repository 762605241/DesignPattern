package chain_of_responsibility;

public class InfoLogger extends AbstractLogger {
    public InfoLogger() {
        // 初始化自身处理级别
        this.setLogLevel(AbstractLogger.INOF);
    }
    @Override
    public void write(String message) {
        System.out.println("Inof日志：" + message);
    }
}
