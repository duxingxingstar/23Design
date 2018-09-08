package design.celue.flybehavior;

/**
 * 不会飞的实现
 */
public class NoFlyBehavior implements FlyBehavior
{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("--NoFly--");
	}
}
