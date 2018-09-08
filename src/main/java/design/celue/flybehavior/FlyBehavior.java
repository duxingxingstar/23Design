package design.celue.flybehavior;

/**好处：新增行为简单，行为类更好的复用，组合更方便。既有继承带来的复用好处，没有挖坑
 * 会飞的鸭子的行为接口
 */
public interface FlyBehavior {
	void fly();
}
