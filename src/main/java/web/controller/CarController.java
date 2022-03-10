package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;



@Controller
public class CarController {
    private CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String getTable(@RequestParam(name = "count", defaultValue = "5")int count,Model model){
        model.addAttribute("count",carService.getTableOfCar(count));
        return "cars";

    }
}
