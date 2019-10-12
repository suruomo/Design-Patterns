package state.first;

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
    static final int SOLD_OUT=0;
    static final int NO_QUARTER=1;
    static final int HAS_QUARTER=2;
    static final int SOLD=3;

    /**
     * 当前糖果机状态
     */
    int state=SOLD_OUT;
    /**
     * 当前糖果机糖果数量
     */
    int count=0;

    public GumballMachine(int count) {
        this.count = count;
        //若当前库存不为0，进入“没有25分”状态，即等待别人投入25分钱
        if(count>0){
            state=NO_QUARTER;
        }
    }
    /**
     * 投入25分钱
     */
    public void insertQuarter(){
        if(state==HAS_QUARTER){
            System.out.println("您已经投过币，请不要重复投币");
        }
        else if(state==NO_QUARTER){
            //若当前是未投币状态，则投币，修改状态
            state=HAS_QUARTER;
            System.out.println("您已经投币完成");
        }else if(state==SOLD_OUT){
            System.out.println("投币失败，该机器已经售光");
        }else if(state==SOLD){
            //上一位顾客刚买完，还在售出状态，等待状态切换
            System.out.println("请稍等，机器正在准备糖果");
        }
    }
    /**
     * 退回25分钱
     */
    public void ejectQuarter(){
       if(state==HAS_QUARTER){
           System.out.println("返回投币");
           state=NO_QUARTER;
       }else if(state==NO_QUARTER){
           System.out.println("还未投币！");
       }else if(state==SOLD){
           System.out.println("糖果已出，无法退钱");
       }else if(state==SOLD_OUT){
           System.out.println("机器已售空，无法退钱");
       }
    }
    /**
     * 转动手柄
     */
    public void turnCrank(){
        if(state==SOLD){
            System.out.println("糖果已出，请继续投币");
        }else if(state==NO_QUARTER){
            System.out.println("请先进行投币操作");
        }else if(state==HAS_QUARTER){
            System.out.println("请等待，正在准备糖果");
            state=SOLD;
            dispense();
        }else if(state==SOLD_OUT){
            System.out.println("糖果机已经售空");
        }
    }

    /**
     * 出糖果操作
     */
    public void dispense() {
        if(state==SOLD){
            count--;
            if(count==0){
                System.out.println("糖果已售空");
                state=SOLD_OUT;
            }else{
                //回到未投币状态，等待下一位客人
                state=NO_QUARTER;
            }
        }else if(state==NO_QUARTER){
            System.out.println("请先投币");
        }else if(state==SOLD_OUT){
            System.out.println("糖果已售空");
        }else if(state==HAS_QUARTER){
            System.out.println("请先转动手柄");
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
