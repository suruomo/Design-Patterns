package template;

/**
 * 茶
 * @author 苏若墨
 */
public class Tea extends CaffeineBeverage{


    @Override
    void addCondiments() {
        System.out.println("4.加柠檬。。。");
    }

    @Override
    void brew() {
        System.out.println("2.冲泡茶叶。。。");
    }

}
