package adapter.enumertoradapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

/**
 * 测试类
 * @author 苏若墨
 */
public class TestAdapter {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        int n=10;
        for(int i=0;i<n;i++){
            list.add(i);
        }
        Enumeration enumerationAdapter=new EnumerationIterator(list.iterator());
        while (enumerationAdapter.hasMoreElements()){
            System.out.println(enumerationAdapter.nextElement());
        }
    }
}
