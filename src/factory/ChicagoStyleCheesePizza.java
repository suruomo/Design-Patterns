package factory;

/**
 * 产品子类：芝加哥披萨
 * @author 苏若墨
 */
public class ChicagoStyleCheesePizza extends  Pizza{
    public ChicagoStyleCheesePizza(){
        name="Chicago Style Sauce and Cheese Pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

}
