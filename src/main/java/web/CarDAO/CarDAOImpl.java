package web.CarDAO;

import web.model.Car;

import java.util.List;
import java.util.stream.Stream;

public class CarDAOImpl implements CarDAO{
//    private Car carM;

    @Override
    public List<Car> getTableOfCar(int count) {
//         List<Car> car = Car.createCars().stream().limit(count).toList();
//         car.stream().forEach(System.out::println);
        return Car.createCars().stream().limit(count).toList();
    }
}
