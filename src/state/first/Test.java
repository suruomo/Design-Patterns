package state.first;

/**
 * 测试类
 * @author 苏若墨
 */
public class Test {
    public static void main(String[] args) {
        GumballMachine gumballMachine=new GumballMachine(5);
        System.out.println(gumballMachine.toString());
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
