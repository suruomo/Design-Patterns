package adapter.duckadapter;

/**
 * @author 苏若墨
 */
public class TestAdapter {
    public static void main(String[] args) {
        MallarDuck mallarDuck=new MallarDuck();
        WildTurkey wildTurkey=new WildTurkey();
        Duck turkeyAdapter=new TurkeyAdapter(wildTurkey);
        System.out.println("WildTurkey says:");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println("MallarDuck says:");
        testDuck(mallarDuck);
        System.out.println("TurkeyAdapter says:");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
