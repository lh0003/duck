package cm.javayum.Type;

import cm.javayum.BehaviorImpl.FlyNoWay;
import cm.javayum.BehaviorImpl.MuteQuack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior=new MuteQuack();
        flyBehavior=new FlyNoWay();
    }
}
