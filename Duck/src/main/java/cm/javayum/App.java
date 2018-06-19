package cm.javayum;

import cm.javayum.BehaviorImpl.Squeak;
import cm.javayum.Type.Duck;
import cm.javayum.Type.MallardDuck;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Duck mallard=new MallardDuck();
        System.out.println(mallard.performQuack());
        mallard.setQuackBehavior(new Squeak());
        System.out.println(mallard.performQuack());
    }
}
