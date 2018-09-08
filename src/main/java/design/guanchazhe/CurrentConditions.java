package design.guanchazhe;

/**
 * 模拟气象
 */
public class CurrentConditions {
	//温度
	private float mTemperature;
	//气压
	private float mPressure;
	//湿度
	private float mHumidity;

    /**
     * 更新数据展示
     * @param mTemperature
     * @param mPressure
     * @param mHumidity
     */
	public void update(float mTemperature,float mPressure,float mHumidity)
	{
		this.mTemperature=mTemperature;
		this.mPressure=mPressure;
		this.mHumidity=mHumidity;
		display();
	}

    /**
     * 展示
     */
	public void display()
	{
		System.out.println("***Today mTemperature: "+mTemperature+"***");
		System.out.println("***Today mPressure: "+mPressure+"***");
		System.out.println("***Today mHumidity: "+mHumidity+"***");
	}
}
