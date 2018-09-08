package design.guanchazhe.observer;

/**
 * 登记中心,登记观察者
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
