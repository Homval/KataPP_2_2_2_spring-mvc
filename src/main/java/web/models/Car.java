package web.models;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;
    private int series;
    private int yearOfProduction;

    public Car() {
    }

    public Car(String model, int series, int yearOfProduction) {
        this.model = model;
        this.series = series;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
