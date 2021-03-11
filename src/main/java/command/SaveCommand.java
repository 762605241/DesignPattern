package command;

/**
 * 具体命令
 * 保存
 */
public class SaveCommand extends AbstractCommand {
    private TextFile textFile;

    public SaveCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.save();
    }
}
