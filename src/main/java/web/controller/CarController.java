package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private static List<Car> cars = new ArrayList<Car>();

    static {
        cars.add(new Car("Tesla", 5, 2020));
        cars.add(new Car("BMW", 3, 2015));
        cars.add(new Car("Audi", 6, 2022));
        cars.add(new Car("Mercedes", 3, 1998));
        cars.add(new Car("Ford", 1, 1930));
    }

    @GetMapping(value = "/cars")
    public String getCarsList(@RequestParam("count") String count, Model model) {
        int intCount = count == null ? 0 : Integer.parseInt(count);
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
