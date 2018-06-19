package cm.javayum.BehaviorImpl;

import cm.javayum.Behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public String quack() {
        return "不会叫";
    }
}
