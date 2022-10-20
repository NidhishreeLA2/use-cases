package com.example.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer>{
	@Query(value = "  select * from employee e join manager m where e.location = 'Bangalore' and m.location = 'Bangalore'",nativeQuery = true)
	List<EmployeeEntity> findlocation();

}
