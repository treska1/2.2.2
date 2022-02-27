package web;

import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

public class testMain {
    public static void main(String[] args) {
        Car car = new Car();
        CarService carService = new CarServiceImpl();

        System.out.println(carService.getTableOfCar(2).toString());;
    }
}
