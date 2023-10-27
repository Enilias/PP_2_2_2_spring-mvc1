package web.service;

import org.springframework.stereotype.Controller;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
public class CarService {
    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Volvo", 1, 2001));
        carList.add(new Car("Chevrolet", 2, 2011));
        carList.add(new Car("Nissan", 3, 2021));
        carList.add(new Car("LADA", 4, 2015));
        carList.add(new Car("Caliburn", 77, 2077));
    }

    public List<Car> getCars(Integer count) {
        if (Objects.nonNull(count)) {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
        return carList;
    }
}
