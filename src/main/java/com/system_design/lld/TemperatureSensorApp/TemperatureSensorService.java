package com.system_design.lld.TemperatureSensorApp;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensorService {
    private final List<Double> readingList = new ArrayList<>();

    public void addReading(double value) {
        if(value >= -50 && value <=150) {
            readingList.add(value);
        }
    }

    public double getAverage() {
        if (readingList.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;

        for(double r : readingList) {
            sum += r;
        }

        return Math.round(sum/readingList.size()*100.0)/100.0;
    }

    public int getReadingCount() {
        return readingList.size();
    }

    public List<Double> getReadingList() {
        return readingList;
    }
}
