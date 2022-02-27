package web.CarDAO;

import web.model.Car;

import java.util.List;
import java.util.stream.Stream;

public interface CarDAO {
     List<Car> getTableOfCar(int count);
}
