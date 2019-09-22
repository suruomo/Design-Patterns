package decorator;

/**
 * 星巴兹咖啡店测试类
 * @author 苏若墨
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        //都买一杯Espresso
        Beverage beverage=new Espresso();
        //打印它的描述和价格
        System.out.println(beverage.getDescription()+"$"+beverage.cost());
        //为这杯咖啡加上Mocha,Cream，打印新描述和价格
        beverage=new Mocha(beverage);
        beverage=new Cream(beverage);
        System.out.println(beverage.getDescription()+"$"+beverage.cost());
    }
}
