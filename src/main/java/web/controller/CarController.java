package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Stream;

@Controller
public class CarController {
    private CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String getTable(@RequestParam(name = "count", defaultValue = "5")int count,Model model){

        List <Car> carList = carService.getTableOfCar(count);
        model.addAttribute("carList",carList);
        return "cars";

    }




}
