package cm.javayum.BehaviorImpl;

import cm.javayum.Behavior.QuackBehavior;
import cm.javayum.Type.Duck;

public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        return "呱呱叫";
    }
}
