package com.home.design.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private double temp;
	private double humidity;
	private double pressure;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(double temp, double humidity, double pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current condition: "+temp+" degree F and "+humidity+" % humid!");
	}

	public double getTemp() {
		return temp;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}
}
