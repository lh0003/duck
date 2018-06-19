package cm.javayum.BehaviorImpl;

import cm.javayum.Behavior.FlyBehavior;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public String fly() {
        return "搭载火箭飞";
    }
}
