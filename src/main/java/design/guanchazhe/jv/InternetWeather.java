package design.guanchazhe.jv;

public class InternetWeather {
	public static void main(String[] args) {
		CurrentConditions mCurrentConditions;
		ForcastConditions mForcastConditions;
		WeatherData mWeatherData;
		 //创建观察者
		mCurrentConditions=new CurrentConditions();
		mForcastConditions=new ForcastConditions();
		//被观察者
		mWeatherData=new WeatherData();

		//订阅观察者
		mWeatherData.addObserver(mCurrentConditions);
		mWeatherData.addObserver(mForcastConditions);
		mWeatherData.setData(30, 150, 40);
		
		mWeatherData.deleteObserver(mCurrentConditions);
		mWeatherData.setData(35, 150, 60);
		
	}
}
