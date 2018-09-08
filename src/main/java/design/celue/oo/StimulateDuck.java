package design.celue.oo;


import java.util.Arrays;
import java.util.List;

public class StimulateDuck {

	public static void main(String[] args) {

		GreenHeadDuck mGreenHeadDuck = new GreenHeadDuck();
		RedHeadDuck mRedHeadDuck = new RedHeadDuck();

		mGreenHeadDuck.display();
		mGreenHeadDuck.Fly();
		mGreenHeadDuck.Quack();
		mGreenHeadDuck.swim();

		mRedHeadDuck.display();
		
		mRedHeadDuck.Quack();
		mRedHeadDuck.swim();
		mRedHeadDuck.Fly();

		List<Integer> list = Arrays.asList(1,2,3,4);
		list.forEach(i -> System.out.println(i));
		
	
	//	mGreenHeadDuck.Fly();
		//mRedHeadDuck.Fly();
	}

}
