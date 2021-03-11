package chain_of_responsibility;

public abstract class AbstractLogger {
    public static int INOF = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    private int logLevel;

    /**
     * 任务处理对象中，包含自身引用，形成链式
     * 当接收到处理任务时，
     *  首先判断是否是自身处理任务，是则处理。
     *  其次将任务继续向下传递，知道任务链结束。
     */
    private AbstractLogger next;

    public int getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(int logLevel) {
        this.logLevel = logLevel;
    }

    public AbstractLogger getNext() {
        return next;
    }

    public void setNext(AbstractLogger next) {
        this.next = next;
    }

    public void logMessage(int logLevel, String message) {
        if (this.logLevel <= logLevel) {
            write(message);
        }
        if (next != null) {
            next.logMessage(logLevel, message);
        }
    }

    public abstract void write(String message);
}
