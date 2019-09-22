package decorator;

/**
 * HouseBlend咖啡（具体组件）
 * @author 苏若墨
 */
public class HouseBlend extends Beverage{
    public HouseBlend(){
        description="House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
