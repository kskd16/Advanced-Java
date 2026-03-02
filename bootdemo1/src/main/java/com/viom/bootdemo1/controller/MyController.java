package com.viom.bootdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.viom.bootdemo1.entity.Student;

@RestController
public class MyController {
	
	
	@GetMapping("/hello")
	public String takeRequest() {
		return "Byeee";
	}
	
	
	//MT = GET
	//URL-> http://localhost:8080/takeData?id=108&name=Khushi Dixit
	@GetMapping("/takeData")
	public String takeData(@RequestParam int id, @RequestParam String name ) {
		return "ID: "+id+" | Name: "+name;
	}
	
	
	
	//MT-GET
	//URL->http://localhost:8080/college?id=101&name=LPU&location=lucknow
	@GetMapping("/college")
	public String collegeInfo(@RequestParam int id, @RequestParam String name, @RequestParam String location) {
		return "ID: "+id+" | NAME: "+name+" | LOCATION: "+location;
	}
	
	
	
	//MT - GET
	//URL->http://localhost:8080/takeData2/108/Khushi Dixit
	@GetMapping("takeData2/{id}/{name}")
	public String takeData2(@PathVariable int id, @PathVariable String name) {
	return "ID: "+id+" | NAME: "+name;
     }
	
	//another way to give path variable below
	
	
//	public String takeData2(@PathVariable(value="id") int student_id , @PathVariable(value="name") String student_name) {
//		return "ID: "+student_id+" | NAME: "+student_name;
//	}
	
	
	
	//MT-GET
	//URL->http://localhost:8080/studentId/55/collegeId/88
	@GetMapping("/studentId/{sId}/collegeId/{cId}")
	public String collegeInfo2(@PathVariable int sId, @PathVariable int cId)
	{
		return "Student ID: "+ sId+" | College ID: "+cId;
	}
	
	
	@GetMapping("/takeData3/{id}/name")
	public String takeData3(@PathVariable int id,@RequestParam String name) {
		return "ID : "+ id+" Name: "+name;
	}
	
	
	//MT-GET
	//URL ->http://localhost:8080/takeData4
	//Header -> id , 55
	//header->name, khushi
	@GetMapping("/takeData4")
	public String takeData4(@RequestHeader int id, @RequestHeader String name) {
		return "ID: "+id+" | NAME: "+name;
	}
	
	
	
	//MT- GET
	//URL->http://localhost:8080/student
	//Body->{"id":101, "name":"Khushi","phone":9569651785}
	@GetMapping("/student")
	public String getStudent(@RequestBody Student s) {
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getPhone());
		return s.getName()+" is received";
	}
	
	
	
	//MT-GET
	//URL->http://localhost:8080/studentJson
	//Body->{"id":101, "name":"Khushi","phone":9569651785}
	@GetMapping("/studentJSON")
	public Student getStudentJSON(@RequestBody Student s) {
		return s;
	}
	//OUTPUT-> {"id": 101,"name": "Khushi","phone": 9569651785}

	
	
}
