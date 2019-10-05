package comand;

/**
 * 测试类
 * @author 苏若墨
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        //调用者，传入命令对象，发出请求
        SimpleRemoteControl simpleRemoteControl=new SimpleRemoteControl();
        //请求的接收者
        Light livingLight=new Light("Living Room");
        Light kitchenLight=new Light("Kitchen");
        Stereo stereo=new Stereo();
        //命令对象，将接收者传给他
        LightOnCommand lightOnCommand=new LightOnCommand(livingLight);
        LightOnCommand lightOnCommand1=new LightOnCommand(kitchenLight);
        LightOffCommand lightOffCommand=new LightOffCommand(livingLight);
        LightOffCommand lightOffCommand1=new LightOffCommand(kitchenLight);
        StereoOnCommand stereoOnCommand=new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand=new StereoOffCommand(stereo);
        //将命令传递给调用者
        //起居室电灯命令对象
        simpleRemoteControl.setCommand(0,lightOnCommand,lightOffCommand);
        //厨房电灯命令对象
        simpleRemoteControl.setCommand(1,lightOnCommand1,lightOffCommand1);
        //音响命令对象
        simpleRemoteControl.setCommand(2,stereoOnCommand,stereoOffCommand);
        //按下按钮，发出请求
        System.out.println(simpleRemoteControl);
        simpleRemoteControl.onButtonWasPressed(0);
        simpleRemoteControl.onButtonWasPressed(1);
        simpleRemoteControl.onButtonWasPressed(2);
        simpleRemoteControl.offButtonWasPressed(0);
        simpleRemoteControl.offButtonWasPressed(1);
        simpleRemoteControl.offButtonWasPressed(2);
    }
}
