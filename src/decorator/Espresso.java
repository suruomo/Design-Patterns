package decorator;

/**
 * 浓缩咖啡类（具体组件）
 * @author 苏若墨
 */
public class Espresso extends Beverage {
    public Espresso(){
        description="Espresso";
    }

    /**
     * 重写cost()
     * 返回浓缩咖啡价值1.99
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
