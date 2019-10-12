package state.second;

/**
 * 未投币状态
 * @author 苏若墨
 */
public class NoQuarterState implements State{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已投币");
        //切换状态为投币状态
        gumballMachine.setState(gumballMachine.getHAS_QUARTER());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("还未投币");
    }

    @Override
    public void turnCrank() {
        System.out.println("还未投币");
    }

    @Override
    public void dispense() {
        System.out.println("还未投币");
    }
}
