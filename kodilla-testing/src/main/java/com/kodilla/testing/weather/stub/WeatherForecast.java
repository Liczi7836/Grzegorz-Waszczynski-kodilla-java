package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature(){
        double average2 = 0.0;
        for(Map.Entry<String, Double> average : temperatures.getTemperatures().entrySet()){
            average2 = average2 + average.getValue();

        }
        return average2 / temperatures.getTemperatures().size();
    }

    public double middleValue(){
        List<Double> mediana = new ArrayList<>();
        double averageVal;
        for(Map.Entry<String, Double> midVal : temperatures.getTemperatures().entrySet()){
            mediana.add(midVal.getValue());
        }
        Collections.sort(mediana);
        if(mediana.size() % 2 == 0){
            int i = mediana.size() / 2;
            averageVal = mediana.get(i-1) + mediana.get(i) / 2;
        } else  {
            double h = mediana.size();
            double i = Math.ceil(h / 2);
            int k = (int) i;
            averageVal = mediana.get(k-1);
        }
        return averageVal;
        }
    }


