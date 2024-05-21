package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    public List<Car> getCountCars(int count, List<Car> cars) {
        if (count >= 5) { return cars; }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
