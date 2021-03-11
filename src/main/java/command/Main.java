package command;

public class Main {
    public static void main(String[] args) {
        // 命令的具体执行者，消费者
        TextFile textFile = new TextFile();
        textFile.setFileName("Test.txt");
        // 具体命令
        AbstractCommand openCommand = new OpenCommand(textFile);
        AbstractCommand editCommand = new EditCommand(textFile);
        AbstractCommand saveCommand = new SaveCommand(textFile);
        // 命令的调用者，生产者
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        textFileOperationExecutor.executeOperation(openCommand);
        textFileOperationExecutor.executeOperation(editCommand);
        textFileOperationExecutor.executeOperation(saveCommand);
    }
}
