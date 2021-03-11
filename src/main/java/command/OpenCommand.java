package command;

/**
 * 具体命令
 * 打开文件
 */
public class OpenCommand extends AbstractCommand {
    private TextFile textFile;

    public OpenCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.open();
    }
}
