package com.viom.bootdemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viom.bootdemo1.entity.College;
import com.viom.bootdemo1.service.CollegeService;




@RequestMapping("/col")
@RestController
public class CollegeController {
	@Autowired
	private CollegeService service;
	
	@PostMapping("/college/save")
	public College saveCollege(@RequestBody College c) {
		
		return service.saveCollege(c);
	}
	
	@GetMapping("/college/save/{id}")
	public College findCollegeById(@PathVariable int id) {
		return service.findCollege(id);
	}
	
	@GetMapping("/college/all")
	public List<College> findAll(){
		return service.findAll();
	}
	
	@DeleteMapping("/college/delete")
	public String deleteCollege(@RequestBody College c) {
		service.deleteCollege(c);
		return "college deleted";
	}
	
	@PostMapping("/college/saveAll")
	public List<College> saveAllCollege(@RequestBody List<College> list){
		return service.saveAllCollege(list);
	}
	
	@DeleteMapping("/college/delete/{id}")
	public String deleteCollegeById(@PathVariable int id) {
		service.deleteById(id);
		return id+" deleted";
	}
	
	

	

}
