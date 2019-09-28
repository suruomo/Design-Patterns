package singleton;

/**
 * @author 苏若墨
 */
public class Singleton {
    /**
     * 静态变量uniqueInstance记录唯一实例
     */
    private volatile static Singleton uniqueInstance;

    /**
     * 构造器私有，只有Singleton类内才可以调用该构造器
     */
    private Singleton(){};

    /**
     * 实例化对象
     * @return
     */
    public static Singleton getInstance(){
        //先检查实例是否创建，若为创建才进行同步，避免多线程问题以及提高性能
        if(uniqueInstance==null){
            synchronized (Singleton.class){
                if(uniqueInstance==null){
                    uniqueInstance=new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
