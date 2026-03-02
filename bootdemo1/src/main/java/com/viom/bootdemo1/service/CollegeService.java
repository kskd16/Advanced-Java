package com.viom.bootdemo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viom.bootdemo1.entity.College;
import com.viom.bootdemo1.repository.CollegeRepository;

@Service
public class CollegeService {
	
	@Autowired
	private CollegeRepository repo;
	
	
	public College saveCollege(College c) {
		return repo.save(c);
	}
	
	public void deleteCollege(College c) {
		repo.delete(c);
	}
	
	public College findCollege(int id) {
		Optional<College> opt = repo.findById(id);
		return opt.get();
	}
	
	public List<College> findAll(){
		return repo.findAll();
	}
	
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
	public List<College> saveAllCollege(List<College> coll){
		return repo.saveAll(coll);
	}

}
