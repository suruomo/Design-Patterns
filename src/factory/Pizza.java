package factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 苏若墨
 */
public class Pizza {
    /**
     * 名称
     */
    private String name;
    /**
     * 面团类型
     */
    private String dough;
    /**
     * 酱料类型
     */
    private String sauce;
    /**
     * 一套佐料
     */
    private List<String> toppings=new ArrayList<>();

    /**
     * 准备工作
     */
    public void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for(int i=0;i<toppings.size();i++){
            System.out.println(" "+toppings.get(i));
        }
    }

    /**
     * 烘烤
     */
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    /**
     * 切片
     */
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    /**
     * 装盒
     */
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    /**
     * 返回姓名
     * @return
     */
    public String getName(){
        return name;
    }
}
