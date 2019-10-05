package comand;

import java.util.Arrays;

/**
 * 实现遥控器
 * @author 苏若墨
 */
public class SimpleRemoteControl {
    /**
     * 数组：七个电器的开，关命令
     */
    Command[] onCommands;
    Command[] offCommands;

    /**
     * 实例并初始化两个开与关的数组
     */
    public SimpleRemoteControl(){
          onCommands=new Command[7];
          offCommands=new Command[7];
          Command noCommand=new NoCommand();
          for(int i=0;i<7;i++){
              onCommands[i]=noCommand;
              offCommands[i]=noCommand;
          }

    }

    /**
     * 遥控器设置命令对象
     * @param slot 插槽位置
     * @param onCommand 开的命令
     * @param offCommand 关的命令
     */
    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }

    /**
     * 按下按钮，执行开命令
     * @param slot
     */
    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
    }
    /**
     * 按下按钮，执行关命令
     * @param slot
     */
    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        return "SimpleRemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
