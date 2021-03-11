package command;

/**
 * 实际命令的执行者,接收者(消费者)
 * 接收者是执行一组内聚操作的对象，是执行实际动作的组件
 */
public class TextFile {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 具体命令的执行逻辑
     */
    public void save() {
        System.out.println("保存文件\t" + fileName);
    }

    /**
     * 具体命令的执行逻辑
     */
    public void open() {
        System.out.println("打开文件\t" + fileName);
    }

    /**
     * 具体命令的执行逻辑
     */
    public void edit() {
        System.out.println("编辑文件\t" + fileName);
    }
}
