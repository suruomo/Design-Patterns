package iterator;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 煎饼屋菜单
 * @author 苏若墨
 */
public class PancakeHouseMenu implements Menu{
    private ArrayList menuItems;
    public PancakeHouseMenu(){
        menuItems=new ArrayList();
        addItem("K&B薄煎饼早餐","薄煎饼，清蛋，吐司",true,2.99);
        addItem("薄煎饼早餐例餐","薄煎饼带煎蛋，香肠",false,2.99);
        addItem("蓝莓薄煎饼","新鲜蓝莓和蓝莓糖浆做成的薄煎饼",true,3.49);
        addItem("松饼","松饼，可以选择蓝莓或者草莓",true,3.99);
    }
    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem=new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    /**
     * 迭代遍历
     * @return
     */
    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
