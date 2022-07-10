package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CarService;
import lk.ijse.spring.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CarServiceImpl  implements CarService {


    @Override
    public void saveCar(CarDTO dto) {

    }

    @Override
    public void deleteCar(String vehicleNum) {

    }

    @Override
    public void updateCar(CarDTO dto) {

    }

    @Override
    public CarDTO searchCar(String vehicleNum) {
        return null;
    }

    @Override
    public List<CarDTO> getAllCar() {
        return null;
    }
}
