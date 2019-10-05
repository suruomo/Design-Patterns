package comand;

/**
 * 音响关闭命令类
 * @author 苏若墨
 */
public class StereoOffCommand implements Command{
    Stereo stereo;
    public StereoOffCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
