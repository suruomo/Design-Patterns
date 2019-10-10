package iterator;

import java.util.Iterator;

/**p
 * 女招待员代码
 * @author 苏若墨
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinnerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    /**
     * 打印菜单
     */
    public void printMenu(){
        Iterator pancakeIterator=pancakeHouseMenu.createIterator();
        Iterator dinnerIterator=dinnerMenu.createIterator();
        System.out.println("早餐菜单：");
        printMenu(pancakeIterator);
        System.out.println("午餐菜单：");
        printMenu(dinnerIterator);
    }
    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem=(MenuItem) iterator.next();
            System.out.println(menuItem.getName()+",");
            System.out.println(menuItem.getDescription()+",");
            System.out.println(menuItem.getPrice()+",");
        }
    }

}
