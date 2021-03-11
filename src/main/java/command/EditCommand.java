package command;

/**
 * 具体命令
 * 编辑
 */
public class EditCommand extends AbstractCommand {
    private TextFile textFile;

    public EditCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.edit();
    }
}
