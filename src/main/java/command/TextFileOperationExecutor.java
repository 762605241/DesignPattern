package command;

/**
 * 命令的发出者，发出执行命令给接收者执行，但不需要知道命令是如何具体执行的。生产者(生产命令)。
 * 执行对象知道如何执行给定命令但不知道命令如何被执行，其仅知道命令接口。
 */
public class TextFileOperationExecutor {
    public void executeOperation(AbstractCommand abstractCommand) {
        abstractCommand.execute();
    }
}
