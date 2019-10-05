package comand;

/**
 * 实现电灯开命令类
 * @author 苏若墨
 */
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
