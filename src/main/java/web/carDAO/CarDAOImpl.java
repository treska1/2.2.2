package web.carDAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;


public class CarDAOImpl implements CarDAO{

    @Override
    public List<Car> showCarsOfCount(int count) {

        return createCars().stream().limit(count).toList();
    }
    public List<Car> createCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", 1));
        cars.add(new Car("model2", 2));
        cars.add(new Car("model3", 3));
        cars.add(new Car("model4", 4));
        cars.add(new Car("model5", 5));
        return cars;
    }
}
