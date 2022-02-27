package web.CarDAO;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    Car getTableOfCar(List<Car> car, int count);
}
