package chain_of_responsibility;

/**
 * 具体日志
 */
public class DebugeLogger extends AbstractLogger {
    public DebugeLogger() {
        // 初始化自身处理级别
        this.setLogLevel(AbstractLogger.DEBUG);
    }

    @Override
    public void write(String message) {
        System.out.println("Debug日志:" + message);
    }
}
