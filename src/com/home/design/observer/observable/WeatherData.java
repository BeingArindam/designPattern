package com.home.design.observer.observable;

import java.util.Observable;

public class WeatherData extends Observable {
	private double temperature;
	private double humidity;
	private double pressure;
	
	public WeatherData() {
	}
	
	public void mesurementChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMesurements(double temperature, double humidity, double pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		mesurementChanged();
	}

	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}
	
	
	
}
