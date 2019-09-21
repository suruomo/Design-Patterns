package observer;

/**
 * 主题接口
 * @author 苏若墨
 */
public interface Subject {
    /**
     * 注册观察者
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 移除观察者
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 通知观察者
     * @param
     */
    public void notifyObserver();
}
