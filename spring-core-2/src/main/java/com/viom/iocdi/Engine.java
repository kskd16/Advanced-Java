package com.viom.iocdi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Engine {

    @Id
    private int id;
    private double cc;

    public Engine() {}

    public Engine(int id, double cc) {
        this.id = id;
        this.cc = cc;
    }

    // getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getCc() { return cc; }
    public void setCc(double cc) { this.cc = cc; }
}