package cm.javayum.BehaviorImpl;

import cm.javayum.Behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public String quack() {
        return "吱吱叫";
    }
}
