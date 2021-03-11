package chain_of_responsibility;

public class Main {

    public static void main(String[] args) {
        /**
         * 创建责任链
         */
        AbstractLogger infoLogger = new InfoLogger();
        AbstractLogger debugLogger = new DebugeLogger();
        AbstractLogger errorLogger = new ErrorLogger();
        errorLogger.setNext(debugLogger);
        debugLogger.setNext(infoLogger);

        /**
         * 使用责任链处理请求
         */

        errorLogger.logMessage(AbstractLogger.ERROR, "记录错误日志");
        System.out.println();
        errorLogger.logMessage(AbstractLogger.DEBUG, "记录debut日志");
        System.out.println();
        errorLogger.logMessage(AbstractLogger.INOF, "记录日志");
    }
}
