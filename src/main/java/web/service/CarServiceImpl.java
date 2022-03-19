package web.service;

import web.carDAO.CarDAO;
import web.carDAO.CarDAOImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
    private CarDAO carDAO = new CarDAOImpl();


    @Override
    public List<Car> getTableOfCar(int count) {
        return carDAO.showCarsOfCount(count);
    }
}
