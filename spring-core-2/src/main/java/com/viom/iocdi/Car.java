package com.viom.iocdi;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;




@Entity
public class Car {

    @Id
    private int id;
    private String brand;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "engine_id")
    private Engine engine;

    public Car() {}

    public Car(int id, String brand, String name) {
        this.id = id;
        this.brand = brand;
        this.name = name;
    }

    // getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Engine getEngine() { return engine; }
    public void setEngine(Engine engine) { this.engine = engine; }
}