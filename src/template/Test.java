package template;

/**
 * 测试类
 * @author 苏若墨
 */
public class Test {
    public static void main(String[] args) {
        Tea tea=new Tea();
        Coffee coffee=new Coffee();
        System.out.println("泡茶步骤：");
        tea.prepareRecipe();
        System.out.println("泡咖啡步骤：");
        coffee.prepareRecipe();
    }
}
