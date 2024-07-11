package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("Tesla", 5, 2020));
        carList.add(new Car("BMW", 3, 2015));
        carList.add(new Car("Audi", 6, 2022));
        carList.add(new Car("Mercedes", 3, 1998));
        carList.add(new Car("Ford", 1, 1930));
    }




    public List<Car> getCarList(int count) {
        if (count <= 0 || count >= 5) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
