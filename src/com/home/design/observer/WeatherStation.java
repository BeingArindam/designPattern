package com.home.design.observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMesurements(80, 63, 30.5);
		weatherData.setMesurements(75, 33, 24.6);
		weatherData.setMesurements(79, 72, 22.8);
	}

}
