package iterator;

import java.util.Iterator;

/**
 * 餐厅菜单迭代器
 * @author 苏若墨
 */
public class DinnerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position=0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position>=menuItems.length||menuItems[position]==null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem=menuItems[position];
        position++;
        return menuItem;
    }
    @Override
    public void remove(){
        if(position<=0){
            throw new IllegalStateException("菜单项为空！无法移除一个菜单项");
        }
        if(menuItems[position]!=null){
            for(int i=position-1;i<menuItems.length-1;i++){
                menuItems[i]=menuItems[i+1];
            }
            menuItems[menuItems.length-1]=null;
        }
    }
}
