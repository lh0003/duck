package cm.javayum.Type;

import cm.javayum.Behavior.FlyBehavior;
import cm.javayum.Behavior.QuackBehavior;

public abstract  class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior   flyBehavior;

    public String swim(){
        return "会游泳";
    }
    public String display(){
        return "会表演";
    }
    public String performQuack(){
        return quackBehavior.quack();
    }
    public String performFly(){
        return flyBehavior.fly();
    }




    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
