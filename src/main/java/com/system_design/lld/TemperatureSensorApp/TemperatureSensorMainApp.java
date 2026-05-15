package com.system_design.lld.TemperatureSensorApp;

public class TemperatureSensorMainApp {
    public static void main(String []args) {

        TemperatureSensorService temperatureSensorService = new TemperatureSensorService();
        temperatureSensorService.addReading(25);
        temperatureSensorService.addReading(-10);
        temperatureSensorService.addReading(50);
        System.out.printf("Temperature Reading %.2f\n",temperatureSensorService.getAverage());

        temperatureSensorService.addReading(-36.5);
        temperatureSensorService.addReading(89.2);
        System.out.printf("Temperature Reading %.2f\n",temperatureSensorService.getAverage());


        System.out.printf("TemperatureReadingCount %d\n", temperatureSensorService.getReadingCount());

    }
}
