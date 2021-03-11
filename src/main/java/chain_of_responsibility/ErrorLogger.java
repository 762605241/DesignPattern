package chain_of_responsibility;

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger() {
        // 初始化自身处理级别
        this.setLogLevel(AbstractLogger.ERROR);
    }

    @Override
    public void write(String message) {
        System.out.println("Errort日志");
    }
}
