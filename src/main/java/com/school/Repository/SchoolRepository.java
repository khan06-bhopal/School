package com.school.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School,Integer>
{
  
}
	
