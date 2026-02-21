/*package com.viom.iocdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarEngineController {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        CarService carService =
                context.getBean(CarService.class);

        // Register Car with Engine
        carService.registerCar(
                101,
                "Mercedes",
                "Benz",
                1001,
                700.00
        );

        // Display all
        carService.displayAll();
    }
}*/