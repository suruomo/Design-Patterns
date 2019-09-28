package factory;

/**
 * 工厂类：披萨店
 * @author 苏若墨
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=createPizza(type);
        pizza.prepare();;
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     *工厂方法：创建披萨，每个加盟店（子类）有自己独特的制作方法，让子类决定要创建的对象
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
