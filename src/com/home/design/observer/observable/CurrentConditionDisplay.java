package com.home.design.observer.observable;

import java.util.Observable;
import java.util.Observer;

import com.home.design.observer.DisplayElement;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private double temp;
	private double humidity;
	private double pressure;
	
	public CurrentConditionDisplay(Observable o) {
		o.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			this.temp = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current condition: "+temp+"F degrees and "+humidity+" % humidity!");
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
