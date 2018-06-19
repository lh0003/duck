package cm.javayum.BehaviorImpl;

import cm.javayum.Behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return "不会飞";
    }
}
