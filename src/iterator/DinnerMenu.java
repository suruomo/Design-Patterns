package iterator;

import java.util.Iterator;

/**
 * @author 苏若墨
 */
public class DinnerMenu implements Menu{
    static final int MAX_ITEMS=6;
    int numberOfItems=0;
    MenuItem[] menuItems;
    public DinnerMenu(){
        menuItems=new MenuItem[MAX_ITEMS];
        addItem("素食BLT","煎培根，生菜和西红柿，面包",false,2.99);
        addItem("BLT","培根，生菜和西红柿",false,2.99);
        addItem("例汤套餐","一碗例汤，配土豆沙拉",true,2.99);
        addItem("热狗套餐","热狗，酸菜，芝士",false,2.99);
    }

    /**
     * 增加菜单项
     * @param name
     * @param description
     * @param vegetarian
     * @param price
     */
    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem=new MenuItem(name, description, vegetarian, price);
        if(numberOfItems>=MAX_ITEMS){
            System.out.println("菜单已满，无法继续添加菜单项");
        }
        else{
            menuItems[numberOfItems]=menuItem;
            numberOfItems++;
        }
    }

    /**
     * 迭代遍历
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
