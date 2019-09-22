package decorator;

/**
 * 调料基类(抽象装饰者），继承自Beverage类，获得相同正确类型
 * @author 苏若墨
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 获取描述
     * @return
     */
    @Override
    public abstract String getDescription();
    @Override
    public double cost() {
        return 0;
    }

}
