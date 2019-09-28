package factory;

/**
 * 产品子类：纽约披萨
 * @author 苏若墨
 */
public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        name="NY Style Sauce and Cheese Pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

}
