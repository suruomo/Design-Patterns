package template;

/**
 * 咖啡因饮料基类
 * @author 苏若墨
 */
public abstract class CaffeineBeverage {
    /**
     * 模板方法：处理步骤
     */
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        /**
         * 钩子：声明在抽象类中的方法，只有空的或者默认实现，钩子可以让子类有能力对算法的不同点进行挂钩，要不要挂钩由系类自行决定
         * 作用：当顾客想加调料时，才调用方法
         */
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    public boolean customerWantsCondiments(){
        return true;
    }

    /**
     * 增加调料：由子类具体决定实现
     */
    abstract void addCondiments();

    /**
     * 冲泡：由子类具体决定实现
     */
    abstract void brew();

    /**
     * 倒入杯子里
     */
    void pourInCup() {
        System.out.println("3.倒进杯子里。。。");
    }

    /**
     * 煮沸水
     */
    void boilWater() {
        System.out.println("1.水煮沸了。。。");
    }
}
