package design.celue.duck;

import design.celue.flybehavior.FlyBehavior;
import design.celue.quackbehavior.QuackBehavior;

/**策略模式：分别封装行为接口，实现算法族，超类里放行为接口对象，在子类里具体设定行为对象。
 * 原则就是：分离变化部分，封装接口，基于接口编程各种功能。
 * 此模式让行为算法的变化独立于算法的使用者
 * 1、分析项目中变化部分与不变部分
 * 2、多用组合少用继承；用行为类组合，而不是行为的继承。更有弹性
 * 策略模式的超类,定义了行为
 */
public abstract class Duck {

	FlyBehavior mFlyBehavior;
	QuackBehavior mQuackBehavior;

	public Duck() {

	}

	public void Fly() {
		mFlyBehavior.fly();
	}

	public void Quack() {
		mQuackBehavior.quack();
	}

	public abstract void display();

	public void SetQuackBehavoir(QuackBehavior qb) {
		mQuackBehavior = qb;
	}

	public void SetFlyBehavoir(FlyBehavior fb) {
		mFlyBehavior = fb;
	}

	public void swim() {
		System.out.println("~~im swim~~");
	}
}
