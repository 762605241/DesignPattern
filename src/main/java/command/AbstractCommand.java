package command;

/**
 * 抽象命令
 * 存储执行动作所需的的所有信息，包括要执行的方法、方法参数以及实现方法的对象（接收者）
 * 通过命令 来解耦 命令发出者(生产者) 和 命令执行者(消费者)
 */
public abstract class AbstractCommand {
    public abstract void execute();
}
