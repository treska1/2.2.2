package web.model;

import java.util.ArrayList;
import java.util.List;


public class Car {

    private long id;
    private String model;
    private int series;

    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

//

    public static List<Car> createCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", 1));
        cars.add(new Car("model2", 2));
        cars.add(new Car("model3", 3));
        cars.add(new Car("model4", 4));
        cars.add(new Car("model5", 5));
        return cars;
    }
}
