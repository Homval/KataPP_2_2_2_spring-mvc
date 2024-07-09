package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getCarsList(@RequestParam(value = "count", defaultValue = "5") String count, Model model) {
        List<Car> cars = carService.getCarList();

        int intCount = Integer.parseInt(count);
        if (intCount == 0 || intCount >= 5) {
            model.addAttribute("cars", cars);
        } else {
            List<Car> outputCars = new ArrayList<>();
            for (int i = 0; i < intCount; i++) {
                outputCars.add(cars.get(i));
            }
            model.addAttribute("cars", outputCars);
        }
        return "/cars";
    }

}
