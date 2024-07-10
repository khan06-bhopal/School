package com.school.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.Repository.SchoolRepository;
import com.school.Service.SchoolService;
import com.school.entity.School;

@Service
public class SchoolImpl implements SchoolService{

	   @Autowired
	  private SchoolRepository schoolRepository;
	
	   
	   @Override
	public School saveSchool(School school) {
		// TODO Auto-generated method stub
		return schoolRepository.save(school);
	}

	@Override
	public List<School> getAllSchool() {
		// TODO Auto-generated method stub
		return  schoolRepository.findAll();
	}

	@Override
	public School getchool(Integer userId) {
		// TODO Auto-generated method stub
		return schoolRepository.findById(userId).orElse(null);
	}

}

