package com.school.Service;

import java.util.List;

import com.school.entity.School;

public interface SchoolService {

    //user operations

    //create

       School saveSchool(School school);
    //get all user
    List<School> getAllSchool();

    //get single user of given userId

    School getchool(Integer userId);

    //TODO: delete
    //TODO: update


}

