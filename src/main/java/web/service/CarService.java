package web.service;


import web.model.Car;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarService {
    private List<Car> cars = new ArrayList<>(Arrays.asList(new Car("car1", 1,1),
            new Car("car2", 2,2),
            new Car("car3", 3,3),
            new Car("car4", 4,4),
            new Car("car5", 5,5)));

    public List<Car> getCars(Integer count) {
        if(count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
