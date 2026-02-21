package com.viom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCollege")
public class College {

    @Value("1001")
    private int id;
    @Value("BBD")
    private String name;
    private String location;
    @Value("BCA")
    private String degree;

    
//    public College() {
//        System.out.println("Default constructor called");
//    }

    
    public College(@Value("LPU") String name,
                   @Value("Phagwara") String location,@Value("MCA") String degree) {
    	//super();
        this.name = name;
        this.location = location;
        this.degree = degree;
    }

    public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Value("B-Tech CSE")
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public String getDegree() { return degree; }
}
