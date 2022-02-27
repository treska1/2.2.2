package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    Car getTableOfCar(List<Car> car, int count);
}
