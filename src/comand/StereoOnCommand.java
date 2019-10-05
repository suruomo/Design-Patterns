package comand;

/**
 * 音响打开命令类
 * @author 苏若墨
 */
public class StereoOnCommand implements Command{
    Stereo stereo;
    public StereoOnCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
