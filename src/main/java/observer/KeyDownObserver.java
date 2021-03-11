package observer;

/**
 * 具体观察者
 * 当键盘被按下时，执行更新
 */
public class KeyDownObserver extends AbstractObserver {
    @Override
    public void update(String keyName, String keyOption) {
        if (keyOption.equals("down")) {
            System.out.println("观察者执行逻辑：" + keyName + "被按下");
        }
    }
}
