//repository is used 
package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.model.Student;
@Repository    //until we use this studentrepository will not be repository  .   
public interface StudentRepository extends JpaRepository<Student, Long> //t-generic type, long is data type of id;
{
	

}
