package decorator;

/**
 * 奶油类（具体装饰者）
 * @author 苏若墨
 */
public class Cream extends CondimentDecorator{
    Beverage beverage;

    /**
     * 使用实例变量记录饮料（被装饰者）
     * @param beverage
     */
    public Cream(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Cream";
    }

    /**
     * 计算带Cream饮料的价格，将调用委托给被装饰对象，计算完价钱后在加上Cream的价格。
     * @return
     */
    @Override
    public double cost() {
        return 12+beverage.cost();
    }
}
