package com.home.design.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private double temperature;
	private double humidity;
	private double pressure;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void mesurementChanged(){
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
