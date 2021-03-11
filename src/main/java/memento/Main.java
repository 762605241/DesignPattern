package memento;

public class Main {
    public static void main(String[] args) {
        // 原对象
        Originator originator = new Originator();
        // 备忘录管理对象
        CareTaker careTaker = new CareTaker();
        originator.setState("State 1");
        originator.setState("State 2");
        //保存状态
        Memento memento = originator.saveStateToMemento();
        // 将保存的状态加入到备忘录管理对象中，以便恢复
        careTaker.add(memento);
        originator.setState("State 3");
        memento = originator.saveStateToMemento();
        careTaker.add(memento);
        originator.setState("State 4");
        memento = originator.saveStateToMemento();
        careTaker.add(memento);

        System.out.println("当前状态：" + originator.getState());
        // 恢复状态
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("保存的第一个状态：" + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("保存的第二个状态：" + originator.getState());

    }
}
