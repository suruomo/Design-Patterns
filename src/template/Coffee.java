package template;

import java.util.Scanner;

/**
 * 咖啡
 * @author 苏若墨
 */
public class Coffee extends CaffeineBeverage{

    @Override
    void addCondiments() {
        System.out.println("4.加糖加奶。。。");
    }

    @Override
    void brew() {
        System.out.println("2.冲泡咖啡。。。");
    }
   @Override
    public boolean customerWantsCondiments(){
        String answer=getUserInput();
        if(answer.toLowerCase().equals("yes")){
            return true;
        }
        else{
            return false;
        }
   }

    private String getUserInput() {
        String answer=null;
        System.out.println("您想要在咖啡中加一些奶和糖吗？（yes/no)");
        Scanner sc=new Scanner(System.in);
        try{
            answer=sc.nextLine();
        }catch (Exception e){
            System.out.println("输入错误");
        }
        if(answer==null){
            return "no";
        }
        return answer;
    }

}
