package cm.javayum.Type;

import cm.javayum.BehaviorImpl.FlyWithWings;
import cm.javayum.BehaviorImpl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

}
