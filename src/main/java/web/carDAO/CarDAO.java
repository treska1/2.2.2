package web.carDAO;

import web.model.Car;

import java.util.List;


public interface CarDAO {
     List<Car> showCarsOfCount(int count);
}
