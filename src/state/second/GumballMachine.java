package state.second;

/**
 * 糖果机
 * @author 苏若墨
 */
public class GumballMachine {
    /**
     * 糖果机状态
     * SOLD_OUT:售完
     * NO_QUARTER：没有25分零钱
     * HAS_QUARTER：有25分零钱
     * SOLD：已售出
     */
    State SOLD_OUT;
    State NO_QUARTER;
    State HAS_QUARTER;
    State SOLD;

    /**
     * 当前糖果机状态
     */
    State state=SOLD_OUT;
    /**
     * 当前糖果机糖果数量
     */
    int count=0;

    /**
     * 初始化状态
     * @param count
     */
    public GumballMachine(int count) {
        SOLD_OUT =new SoldOutState(this);
        NO_QUARTER =new NoQuarterState(this);
        HAS_QUARTER = new HasQuarterState(this);
        SOLD = new SoldState(this);
        this.count = count;
        if(count>0){
            state=NO_QUARTER;
        }
    }

    /**
     * 投币
     */
    public void insertQuarter(){
        state.insertQuarter();
    }
    /**
     * 退币
     */
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    /**
     * 转动手柄
     */
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    public void releaseBall(){
        System.out.println("正在出糖果。。");
        if(count!=0){
            count--;
        }
    }

    public State getSOLD_OUT() {
        return SOLD_OUT;
    }

    public void setSOLD_OUT(State SOLD_OUT) {
        this.SOLD_OUT = SOLD_OUT;
    }

    public State getNO_QUARTER() {
        return NO_QUARTER;
    }

    public void setNO_QUARTER(State NO_QUARTER) {
        this.NO_QUARTER = NO_QUARTER;
    }

    public State getHAS_QUARTER() {
        return HAS_QUARTER;
    }

    public void setHAS_QUARTER(State HAS_QUARTER) {
        this.HAS_QUARTER = HAS_QUARTER;
    }

    public State getSOLD() {
        return SOLD;
    }

    public void setSOLD(State SOLD) {
        this.SOLD = SOLD;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
