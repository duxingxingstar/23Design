package design.celue;


import design.celue.duck.Duck;
import design.celue.duck.GreenHeadDuck;
import design.celue.duck.RedHeadDuck;
import design.celue.flybehavior.NoFlyBehavior;
import design.celue.quackbehavior.NoQuackBehavior;

public class StimulateDuck {


	public static void main(String[] args) {

		Duck mGreenHeadDuck = new GreenHeadDuck();
		Duck mRedHeadDuck = new RedHeadDuck();

		mGreenHeadDuck.display();
		mGreenHeadDuck.Fly();
		mGreenHeadDuck.Quack();

		mGreenHeadDuck.swim();

		mRedHeadDuck.display();
		mRedHeadDuck.Fly();
		mRedHeadDuck.Quack();
		mRedHeadDuck.swim();
		mRedHeadDuck.display();
		mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
		mRedHeadDuck.Fly();
		mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
		mRedHeadDuck.Quack();
	}

}
