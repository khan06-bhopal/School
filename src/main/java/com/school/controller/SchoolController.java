package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.Service.SchoolService;
import com.school.entity.School;

@RequestMapping("/schools")
@RestController
public class SchoolController {

	@Autowired
	private SchoolService schoolService;
	
	
	@PostMapping
	public School addschool(@RequestBody School school) { 
		
		return schoolService.saveSchool(school);
		
	}
	
	@GetMapping
	public List<School> fetchAllSchool(){ 
		
		return schoolService.getAllSchool();
	}
	
	@GetMapping("/{id}")
	public School fetchSchoolById( @PathVariable int  id) { 
		return schoolService.getchool(id);
				
	}
}
