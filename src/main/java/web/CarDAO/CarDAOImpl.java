package web.CarDAO;

import web.model.Car;

import java.util.List;


public class CarDAOImpl implements CarDAO{

    @Override
    public List<Car> showCarsOfCount(int count) {

        return Car.createCars().stream().limit(count).toList();
    }
}
