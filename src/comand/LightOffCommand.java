package comand;

/**
 * 实现电灯关命令类
 * @author 苏若墨
 */
public class LightOffCommand implements Command{
    Light light;
    public LightOffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
