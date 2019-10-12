package state.second;

/**
 * 状态类
 * @author 苏若墨
 */
public interface State {
    /**
     * 投币
     */
    void insertQuarter();
    /**
     * 退币
     */
    void ejectQuarter();
    /**
     * 转动手柄
     */
    void turnCrank();
    /**
     * 出糖果
     */
    void dispense();
}
