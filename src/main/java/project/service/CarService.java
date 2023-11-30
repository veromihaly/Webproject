package project.service;

import project.uito.CarUITO;

import java.util.List;

public interface CarService {

    List<CarUITO> getAllCar();

    CarUITO getCar(CarUITO carUITO);

}
