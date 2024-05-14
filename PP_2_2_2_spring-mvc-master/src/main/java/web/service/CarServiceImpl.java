package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Audi", "red", 2005));
        cars.add(new Car("BMW", "blue", 1999));
        cars.add(new Car("Kia", "pink", 2011));
        cars.add(new Car("Toyota", "black", 2023));
        cars.add(new Car("Mazda", "white", 2024));
    }

    @Override
    public List<Car> show(int count) {
        return cars.stream()
                .limit(count)
                .toList();
    }
}
