package factory;

/**
 * 披萨店测试类
 * @author 苏若墨
 */
public class PizzaTest {
    public static void main(String[] args) {
        //分别建立纽约披萨店和芝加哥披萨店
        PizzaStore nyPizzaStoreStore=new NYPizzaStore();
        PizzaStore chicagoPizzaStore=new ChicagoPizzaStore();
        //Ethan在纽约店下订单
        Pizza pizza=nyPizzaStoreStore.orderPizza("cheese");
        System.out.println("Ethan orderes a "+pizza.getName());
        //joe在芝加哥店下订单
        pizza=chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joe orderes a "+pizza.getName());
    }
}
