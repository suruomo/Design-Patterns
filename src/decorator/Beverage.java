package decorator;

/**
 * 所有饮料基类（抽象组件）
 * @author 苏若墨
 */
public abstract class Beverage {
    String description="Unknown Beverage";
    public String getDescription(){
        return description;
    }

    /**
     * 花费
     * @return
     */
    public abstract double cost();
}
