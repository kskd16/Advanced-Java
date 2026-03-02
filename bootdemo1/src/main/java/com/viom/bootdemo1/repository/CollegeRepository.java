package com.viom.bootdemo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viom.bootdemo1.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {

}
