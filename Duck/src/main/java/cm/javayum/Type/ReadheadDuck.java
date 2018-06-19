package cm.javayum.Type;

import cm.javayum.BehaviorImpl.FlyWithRocket;
import cm.javayum.BehaviorImpl.Quack;
import cm.javayum.BehaviorImpl.Squeak;

public class ReadheadDuck extends Duck {
    public ReadheadDuck() {
        quackBehavior=new Squeak();
        flyBehavior=new FlyWithRocket();
    }
}
