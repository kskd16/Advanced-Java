package com.viom.bootdemo1.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lpu")
@RestController
public class LpuController {
	
	
	@RequestMapping("/m1")
	public String m1() {
		return "m1 returned";
	}
	
	@PostMapping("/student")
	public String student() {
		return "student returned";
	}
	
	@PutMapping("/saved")
	public String saved() {
		return "saved returned";
	}
	@DeleteMapping("/delete")
	public String delete() {
		return "delete returned";
	}
}
