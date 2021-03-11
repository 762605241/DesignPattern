package observer;

/**
 * 具体观察者
 * 当键盘被释放时，执行更新
 */
public class KeyUpObserver extends AbstractObserver {
    @Override
    public void update(String keyName, String keyOption) {
        if (keyOption.equals("up")) {
            System.out.println("观察者执行逻辑：" + keyName + "被释放");
        }
    }
}
