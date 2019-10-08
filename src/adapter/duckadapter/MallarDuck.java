package adapter.duckadapter;

/**
 * 绿头鸭
 * @author 苏若墨
 */
public class MallarDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
