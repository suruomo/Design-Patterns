package state.second;

/**
 * 售出状态
 * @author 苏若墨
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine=gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("糖果已出，无法投币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("糖果已出，无法转动手柄");
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果已出");
    }

    @Override
    public void dispense() {
      gumballMachine.releaseBall();
      if(gumballMachine.getCount()>0){
          //转换状态为未投币状态，等待下一次投币操作
          gumballMachine.setState(gumballMachine.getNO_QUARTER());
      }
      else{
          System.out.println("已经售空");
          gumballMachine.setState(gumballMachine.getSOLD_OUT());
      }
    }
}
