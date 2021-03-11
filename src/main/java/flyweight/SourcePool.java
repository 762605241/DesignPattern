package flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 管理原始类
 */
public class SourcePool {
    private HashMap<String, Source> sourceHashMap = new HashMap<>();

    public Source getSource(String name) {
        Source source = sourceHashMap.get(name);
        if (source == null) {
            source = new Source();
            source.setName(name);
            sourceHashMap.put(name, source);
            System.out.println("新建对象\t" + name);
            return source;
        } else {
            System.out.println("取出对象\t" + name);
            return source;
        }
    }
}
