package com.home.design.observer.observable;

import java.util.Observable;
import java.util.Observer;

import com.home.design.observer.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {
	private double currentPressure = 30.23;
	private double lastPressure;

	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData data = (WeatherData) o;
			lastPressure = currentPressure;
			currentPressure = data.getPressure();
			display();
		}
	}

}
