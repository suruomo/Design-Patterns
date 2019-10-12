package state.second;

/**
 * 已投币状态
 * @author 苏若墨
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine=gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("无法投币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("正在退币");
        gumballMachine.setState(gumballMachine.getNO_QUARTER());
    }

    @Override
    public void turnCrank() {
        System.out.println("正在转动手柄");
        gumballMachine.setState(gumballMachine.getSOLD());
    }

    @Override
    public void dispense() {
        System.out.println("还未转动手柄");
    }
}
