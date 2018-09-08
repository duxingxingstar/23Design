package design.celue.duck;

import design.celue.flybehavior.GoodFlyBehavior;
import design.celue.quackbehavior.GaGaQuackBehavior;

/**
 * 通过继承Duck,获得行为接口,自己来决定行为的实现方式,不用Duck父类实现
 */
public class GreenHeadDuck extends Duck {

	public GreenHeadDuck() {
		mFlyBehavior = new GoodFlyBehavior();
		mQuackBehavior = new GaGaQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**GreenHead**");
	}

}