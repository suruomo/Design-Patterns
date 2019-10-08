package adapter.enumertoradapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 将迭代器适配成枚举
 * @author 苏若墨
 */
public class EnumerationIterator implements Enumeration{
    Iterator iterator;
    public EnumerationIterator(Iterator iterator){
        this.iterator=iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
