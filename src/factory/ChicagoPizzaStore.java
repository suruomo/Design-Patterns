package factory;

/**
 * 芝加哥披萨店
 * @author 苏若墨
 */
public class ChicagoPizzaStore extends PizzaStore {
    /**
     * 创建披萨，可以有很多种不同的子类创建方法，在此只列举了一种
     * @param type
     * @return
     */
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}