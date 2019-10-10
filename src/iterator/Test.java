package iterator;

/**
 * 测试类
 * @author 苏若墨
 */
public class Test {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinnerMenu=new DinnerMenu();
        Waitress waitress=new Waitress(pancakeHouseMenu,dinnerMenu);
        waitress.printMenu();
    }
}
