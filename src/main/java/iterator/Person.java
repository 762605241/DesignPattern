package iterator;

import javax.naming.Name;

public class Person extends Container{
    private String[] name;

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    /**
     * Person 容器 Name属性的迭代器
     */
    private class NameIterator implements Iterator<String>{
        int index;

        @Override
        public boolean hasNext() {
            if (index < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            if (hasNext()) {
                return name[index++];
            }
            return null;
        }
    }
}
