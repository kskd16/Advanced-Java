/*package com.viom.iocdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarService {
	CarDao carDao = new CarDao();
	ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
	
	public Car registerCar (int id, String brand, String name) {
		
		if(id< 0) {
			throw new IllegalArgumentException("id must be greater than 0");
		}
		
		Car car = ac.getBean("car",Car.class);
		return carDao.saveCar(car);
		
	}
	
	public void updateCarName(int id, String newName) {
		
		carDao.updateCarName(id, newName);
	}
	
	public void findCarById(int id) {
		carDao.findCarById(id);
	}
	public void findAll() {
		carDao.findAll();
	}
	
	public void deleteCar(int id) {
		if(id < 0) {
			throw new IllegalArgumentException("Invalid id");
		}
		carDao.removeCarById(id);
	}

}

package com.viom.iocdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private CarDao carDao;

    public void registerCar(int carId, String brand, String name,
                            int engineId, double cc) {

        Car car = new Car(carId, brand, name);
        Engine engine = new Engine(engineId, cc);

        car.setEngine(engine);

        carDao.save(car);
    }

    public void displayAll() {
        carDao.findAll().forEach(c ->
                System.out.println(
                        c.getId() + " "
                        + c.getBrand() + " "
                        + c.getName() + " Engine CC: "
                        + c.getEngine().getCc()
                )
        );
    }
}*/
