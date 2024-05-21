package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarServiceImp carServiceImp;

    @Autowired
    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", 1250, "black"));
        carList.add(new Car("Jaguar", 3552, "green"));
        carList.add(new Car("Porsche", 911, "red"));
        carList.add(new Car("Audi", 1760, "white"));
        carList.add(new Car("Mercedes", 3250, "brown"));
        model.addAttribute("carList", carServiceImp.getCountCars(count, carList));

        return "cars";
    }
}
